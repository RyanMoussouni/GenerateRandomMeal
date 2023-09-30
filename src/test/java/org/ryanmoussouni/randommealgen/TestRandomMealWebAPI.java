package org.ryanmoussouni.randommealgen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;

public class TestRandomMealWebAPI {
    public static final String MEAL_WEB_API_ENDPOINT_URI = "www.themealdb.com/api/json/v1/1/random.php";
    private HttpRequest apiClient;

    @BeforeEach
    void setUp() throws URISyntaxException {
        apiClient = HttpRequest.newBuilder()
                .uri(new URI(MEAL_WEB_API_ENDPOINT_URI))
                .GET()
                .build();
    }

    @Test
    void performHttpRequest_returnsListOfMeal() {
        throw new RuntimeException();
    }
}
