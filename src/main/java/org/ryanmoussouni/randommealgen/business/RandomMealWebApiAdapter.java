package org.ryanmoussouni.randommealgen.business;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.ryanmoussouni.randommealgen.business.MealFetcher;
import org.ryanmoussouni.randommealgen.business.MealSupplier;
import org.ryanmoussouni.randommealgen.domain.Meal;
import org.ryanmoussouni.randommealgen.domain.MealsDTO;
import org.ryanmoussouni.randommealgen.error.MealGenerationError;
import org.ryanmoussouni.randommealgen.error.WebCommunicationException;
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
    public Meal getMeal() throws MealGenerationError {
        try {
            var httpResponse = httpClient.fetchMeals();
            var objectMapper = new ObjectMapper();
            var meals = objectMapper.readValue(httpResponse.body(), MealsDTO.class);
            return meals.getMeals()
                    .get(0);
        } catch (JsonProcessingException | WebCommunicationException e) {
            throw new MealGenerationError(e);
        }
    }
}
