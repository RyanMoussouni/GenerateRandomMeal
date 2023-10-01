package org.ryanmoussouni.randommealgen.business;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.ryanmoussouni.randommealgen.domain.Meal;
import org.ryanmoussouni.randommealgen.error.MealGenerationError;
import org.ryanmoussouni.randommealgen.error.WebCommunicationException;

import java.net.http.HttpResponse;

import static org.mockito.Mockito.*;

class RandomMealWebApiAdapterTest {
    @Test
    void getMeals_errorWhenFetching_throwsMealGenerationError() {
        var mealFetcherStub = mock(MealFetcher.class);
        try {
            doAnswer((invocation) -> {
                throw new MealGenerationError(new Exception());
            }).when(mealFetcherStub)
            .fetchMeals();
        } catch (WebCommunicationException e) {
            // do nothing
        }
        var adapter = new RandomMealWebApiAdapter();
        adapter.setHttpClient(mealFetcherStub);

        try {
            adapter.getMeal();
            Assertions.fail();
        } catch (MealGenerationError e) {
            //success
        }
    }

    @Test
    void getMeals_singleMealReturnedByFetcher_returnsTheMeal() {
        var expectedMeal = createMealFixture();
        var mealFetcherStub = mock(MealFetcher.class);
        var httpResponseStub = mock(HttpResponse.class);
        when(httpResponseStub.body())
                .thenReturn(createFetcherResponseFixture());
        try {
            when(mealFetcherStub.fetchMeals())
                    .thenReturn(httpResponseStub);
        } catch (WebCommunicationException e) {
            //do nothing
        }
        var adapter = new RandomMealWebApiAdapter();
        adapter.setHttpClient(mealFetcherStub);

        try {
            var actualMeal = adapter.getMeal();
            Assertions.assertEquals(actualMeal, expectedMeal);
        } catch (MealGenerationError e) {
            Assertions.fail();
        }
    }

    private Meal createMealFixture() {
        return Meal.builder()
                .idMeal("53076")
                .strMeal("Bread omelette")
                .strDrinkAlternate(null)
                .strCategory("Breakfast")
                .strArea("Indian")
                .strInstructions("Make and enjoy")
                .strMealThumb("https://www.themealdb.com/images/media/meals/hqaejl1695738653.jpg")
                .strTags(null)
                .strYoutube("")
                .strIngredient1("Bread")
                .strIngredient2("Egg")
                .strIngredient3("Salt")
                .strIngredient4("")
                .strIngredient5("")
                .strIngredient6("")
                .strIngredient7("")
                .strIngredient8("")
                .strIngredient9("")
                .strIngredient10("")
                .strIngredient11("")
                .strIngredient12("")
                .strIngredient13("")
                .strIngredient14("")
                .strIngredient15("")
                .strIngredient16("")
                .strIngredient17("")
                .strIngredient18("")
                .strIngredient19("")
                .strIngredient20("")
                .strMeasure1("2")
                .strMeasure2("2")
                .strMeasure3("0.5")
                .strMeasure4(" ")
                .strMeasure5(" ")
                .strMeasure6(" ")
                .strMeasure7(" ")
                .strMeasure8(" ")
                .strMeasure9(" ")
                .strMeasure10(" ")
                .strMeasure11(" ")
                .strMeasure12(" ")
                .strMeasure13(" ")
                .strMeasure14(" ")
                .strMeasure15(" ")
                .strMeasure16(" ")
                .strMeasure17(" ")
                .strMeasure18(" ")
                .strMeasure19(" ")
                .strMeasure20(" ")
                .strSource("")
                .strImageSource(null)
                .strCreativeCommonsConfirmed(null)
                .dateModified(null)
                .build();
    }

    private String createFetcherResponseFixture() {
        return """
                {
                    "meals": [
                        {
                            "idMeal": "53076",
                            "strMeal": "Bread omelette",
                            "strDrinkAlternate": null,
                            "strCategory": "Breakfast",
                            "strArea": "Indian",
                            "strInstructions": "Make and enjoy",
                            "strMealThumb": "https://www.themealdb.com/images/media/meals/hqaejl1695738653.jpg",
                            "strTags": null,
                            "strYoutube": "",
                            "strIngredient1": "Bread",
                            "strIngredient2": "Egg",
                            "strIngredient3": "Salt",
                            "strIngredient4": "",
                            "strIngredient5": "",
                            "strIngredient6": "",
                            "strIngredient7": "",
                            "strIngredient8": "",
                            "strIngredient9": "",
                            "strIngredient10": "",
                            "strIngredient11": "",
                            "strIngredient12": "",
                            "strIngredient13": "",
                            "strIngredient14": "",
                            "strIngredient15": "",
                            "strIngredient16": "",
                            "strIngredient17": "",
                            "strIngredient18": "",
                            "strIngredient19": "",
                            "strIngredient20": "",
                            "strMeasure1": "2",
                            "strMeasure2": "2",
                            "strMeasure3": "0.5",
                            "strMeasure4": " ",
                            "strMeasure5": " ",
                            "strMeasure6": " ",
                            "strMeasure7": " ",
                            "strMeasure8": " ",
                            "strMeasure9": " ",
                            "strMeasure10": " ",
                            "strMeasure11": " ",
                            "strMeasure12": " ",
                            "strMeasure13": " ",
                            "strMeasure14": " ",
                            "strMeasure15": " ",
                            "strMeasure16": " ",
                            "strMeasure17": " ",
                            "strMeasure18": " ",
                            "strMeasure19": " ",
                            "strMeasure20": " ",
                            "strSource": "",
                            "strImageSource": null,
                            "strCreativeCommonsConfirmed": null,
                            "dateModified": null
                        }
                    ]
                }
                """;
    }
}