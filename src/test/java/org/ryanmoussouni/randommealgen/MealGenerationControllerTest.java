package org.ryanmoussouni.randommealgen;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.ryanmoussouni.randommealgen.business.MealSupplier;
import org.ryanmoussouni.randommealgen.domain.Meal;
import org.ryanmoussouni.randommealgen.error.MealGenerationError;
import org.springframework.http.HttpStatus;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MealGenerationControllerTest {

    @Test
    void handleRandomMeal_supplierSuppliesMeal_returnsSuccessfulResponse() throws MealGenerationError {
        var mealSupplierStub = mock(MealSupplier.class);
        when(mealSupplierStub.getMeal())
                .thenReturn(createMealFixture());
        var controller = new MealGenerationController();
        controller.setRandomMealSupplier(mealSupplierStub);

        var actualMeal = controller.handleRandomMeal();

        Assertions.assertThat(actualMeal.getStatusCode())
                .isEqualTo(HttpStatus.OK);
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
}