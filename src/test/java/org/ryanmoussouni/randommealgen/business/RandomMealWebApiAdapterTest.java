package org.ryanmoussouni.randommealgen.business;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.ryanmoussouni.randommealgen.error.MealGenerationError;
import org.ryanmoussouni.randommealgen.error.WebCommunicationException;

import static org.mockito.Mockito.*;

class RandomMealWebApiAdapterTest {
    @Test
    void getMeals_errorWhenFetching_throwsMealGenerationError() {
        var mealFetcherMock = mock(MealFetcher.class);
        try {
            doAnswer((invocation) -> {
                throw new MealGenerationError(new Exception());
            }).when(mealFetcherMock)
            .fetchMeals();
        } catch (WebCommunicationException e) {
            // do nothing
        }
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