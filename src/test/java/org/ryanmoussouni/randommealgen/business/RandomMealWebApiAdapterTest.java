package org.ryanmoussouni.randommealgen.business;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.ryanmoussouni.randommealgen.error.MealGenerationError;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class RandomMealWebApiAdapterTest {
    @Test
    void getMeals_errorWhenFetchingFromApi_throwsMealGenerationError() {
        var exception = buidMealGenerationError();
        var mealFetcherMock = mock(MealFetcher.class);
        when(mealFetcherMock).thenThrow(exception);
        var adapter = new RandomMealWebApiAdapter();
        adapter.setHttpClient(mealFetcherMock);

        try {
            adapter.getMeal();
            Assertions.fail();
        } catch (MealGenerationError e) {
            //success
        }
    }

    private MealGenerationError buidMealGenerationError() {
        return new MealGenerationError(new Exception());
    }

}