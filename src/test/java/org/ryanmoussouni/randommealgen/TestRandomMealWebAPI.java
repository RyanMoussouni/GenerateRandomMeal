package org.ryanmoussouni.randommealgen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class TestRandomMealWebAPI {
    public static final String MEAL_WEB_API_ENDPOINT_URI = "www.themealdb.com/api/json/v1/1/random.php";
    private HttpClient apiClient;

    @BeforeEach
    void setUp() {
        apiClient = HttpClient.newBuilder()
                .build();
    }

    @Test
    void performHttpRequest_returnsListOfMeal() throws IOException, InterruptedException, URISyntaxException {
        var httpRequest = HttpRequest.newBuilder()
                .uri(new URI(MEAL_WEB_API_ENDPOINT_URI))
                .GET()
                .build();

        apiClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        throw new RuntimeException();
    }
}
