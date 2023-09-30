package org.ryanmoussouni.randommealgen;

import java.net.http.HttpClient;

public class RandomMealWebApiAdapter implements MealSupplier {
    private HttpClient webApiClient;

    @Override
    public Meal getMeal() {
        throw new UnsupportedOperationException();
    }
}
