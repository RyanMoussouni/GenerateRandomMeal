package org.ryanmoussouni.randommealgen;

import org.ryanmoussouni.randommealgen.Error.WebCommunicationException;

import java.net.http.HttpResponse;

public interface MealFetcher {
    HttpResponse<String> fetchMeals() throws WebCommunicationException;
}
