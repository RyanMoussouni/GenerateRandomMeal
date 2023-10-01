package org.ryanmoussouni.randommealgen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class RandomMealWebApiAdapter implements MealSupplier {
    private MealFetcher httpClient;

    @Autowired
    public void setHttpClient(MealFetcher httpClient) {
        this.httpClient = httpClient;
    }

    @Override
    public Meal getMeal() {
        throw new UnsupportedOperationException();
    }
}
