package org.ryanmoussouni.randommealgen.business;

import org.ryanmoussouni.randommealgen.error.WebCommunicationException;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Component
public class MealWebApiClient implements MealFetcher {
    private static final HttpClient httpClient = HttpClient.newBuilder()
            .build();

    @Override
    public HttpResponse<String> fetchMeals() throws WebCommunicationException {
        try {
            var httpRequest = buildHttpRequest();
            return httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        } catch (URISyntaxException | InterruptedException | IOException e) {
            throw new WebCommunicationException(e);
        }
    }

    private static HttpRequest buildHttpRequest() throws URISyntaxException {
        return HttpRequest.newBuilder()
                .uri(new URI("https://www.themealdb.com/api/json/v1/1/random.php"))
                .GET()
                .build();
    }
}
