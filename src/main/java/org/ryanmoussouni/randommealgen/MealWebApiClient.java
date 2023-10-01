package org.ryanmoussouni.randommealgen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Component
public class MealWebApiClient implements MealFetcher {
    private HttpClient httpClient;

    @Override
    public HttpResponse<String> fetchMeals() {
        try {
            var httpRequest = buildHttpRequest();
            return httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static HttpRequest buildHttpRequest() throws URISyntaxException {
        return HttpRequest.newBuilder()
                .uri(new URI("https://www.themealdb.com/api/json/v1/1/random.php"))
                .GET()
                .build();
    }
}
