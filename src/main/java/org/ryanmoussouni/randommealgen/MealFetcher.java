package org.ryanmoussouni.randommealgen;

import java.net.http.HttpResponse;

public interface MealFetcher {
    HttpResponse<String> fetchMeals() throws WebCommunicationException;
}
