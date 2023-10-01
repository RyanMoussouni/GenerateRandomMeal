package org.ryanmoussouni.randommealgen.business;

import org.ryanmoussouni.randommealgen.error.WebCommunicationException;

import java.net.http.HttpResponse;

public interface MealFetcher {
    HttpResponse<String> fetchMeals() throws WebCommunicationException;
}
