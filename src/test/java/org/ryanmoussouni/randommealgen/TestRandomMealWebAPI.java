package org.ryanmoussouni.randommealgen;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Tag("Integration")
public class TestRandomMealWebAPI {
    public static final String MEAL_WEB_API_ENDPOINT_URI = "https://www.themealdb.com/api/json/v1/1/random.php";
    private HttpClient apiClient;

    @BeforeEach
    void setUp() {
        apiClient = HttpClient.newBuilder()
                .build();
    }

    @Test
    void performHttpRequest_doesNotThrow() {
        try {
            var httpRequest = HttpRequest.newBuilder()
                    .uri(new URI(MEAL_WEB_API_ENDPOINT_URI))
                    .GET()
                    .build();

            apiClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        } catch (IOException ioe) {
            Assertions.fail("The method threw an IOException");
        } catch (InterruptedException ie) {
            Assertions.fail("The method threw an InterruptedException");
        } catch (URISyntaxException use){
            Assertions.fail("The method threw an URISyntaxException");
        }
    }
}
