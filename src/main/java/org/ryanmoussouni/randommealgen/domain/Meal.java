package org.ryanmoussouni.randommealgen.domain;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Meal {
    @JsonProperty
    private String idMeal;
    @JsonProperty
    private String strMeal;
    @JsonProperty
    private String strDrinkAlternate;
    @JsonProperty
    private String strCategory;
    @JsonProperty
    private String strArea;
    @JsonProperty
    private String strInstructions;
    @JsonProperty
    private String strMealThumb;
    @JsonProperty
    private String strTags;
    @JsonProperty
    private String strYoutube;
    @JsonProperty
    private String strIngredient1;
    @JsonProperty
    private String strIngredient2;
    @JsonProperty
    private String strIngredient3;
    @JsonProperty
    private String strIngredient4;
    @JsonProperty
    private String strIngredient5;
    @JsonProperty
    private String strIngredient6;
    @JsonProperty
    private String strIngredient7;
    @JsonProperty
    private String strIngredient8;
    @JsonProperty
    private String strIngredient9;
    @JsonProperty
    private String strIngredient10;
    @JsonProperty
    private String strIngredient11;
    @JsonProperty
    private String strIngredient12;
    @JsonProperty
    private String strIngredient13;
    @JsonProperty
    private String strIngredient14;
    @JsonProperty
    private String strIngredient15;
    @JsonProperty
    private String strIngredient16;
    @JsonProperty
    private String strIngredient17;
    @JsonProperty
    private String strIngredient18;
    @JsonProperty
    private String strIngredient19;
    @JsonProperty
    private String strIngredient20;
    @JsonProperty
    private String strMeasure1;
    @JsonProperty
    private String strMeasure2;
    @JsonProperty
    private String strMeasure3;
    @JsonProperty
    private String strMeasure4;
    @JsonProperty
    private String strMeasure5;
    @JsonProperty
    private String strMeasure6;
    @JsonProperty
    private String strMeasure7;
    @JsonProperty
    private String strMeasure8;
    @JsonProperty
    private String strMeasure9;
    @JsonProperty
    private String strMeasure10;
    @JsonProperty
    private String strMeasure11;
    @JsonProperty
    private String strMeasure12;
    @JsonProperty
    private String strMeasure13;
    @JsonProperty
    private String strMeasure14;
    @JsonProperty
    private String strMeasure15;
    @JsonProperty
    private String strMeasure16;
    @JsonProperty
    private String strMeasure17;
    @JsonProperty
    private String strMeasure18;
    @JsonProperty
    private String strMeasure19;
    @JsonProperty
    private String strMeasure20;
    @JsonProperty
    private String strSource;
    @JsonProperty
    private String strImageSource;
    @JsonProperty
    private String strCreativeCommonsConfirmed;
    @JsonProperty
    private String dateModified;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Meal meal = (Meal) o;
        return Objects.equals(idMeal, meal.idMeal) && Objects.equals(strMeal, meal.strMeal) && Objects.equals(strDrinkAlternate, meal.strDrinkAlternate) && Objects.equals(strCategory, meal.strCategory) && Objects.equals(strArea, meal.strArea) && Objects.equals(strInstructions, meal.strInstructions) && Objects.equals(strMealThumb, meal.strMealThumb) && Objects.equals(strTags, meal.strTags) && Objects.equals(strYoutube, meal.strYoutube) && Objects.equals(strIngredient1, meal.strIngredient1) && Objects.equals(strIngredient2, meal.strIngredient2) && Objects.equals(strIngredient3, meal.strIngredient3) && Objects.equals(strIngredient4, meal.strIngredient4) && Objects.equals(strIngredient5, meal.strIngredient5) && Objects.equals(strIngredient6, meal.strIngredient6) && Objects.equals(strIngredient7, meal.strIngredient7) && Objects.equals(strIngredient8, meal.strIngredient8) && Objects.equals(strIngredient9, meal.strIngredient9) && Objects.equals(strIngredient10, meal.strIngredient10) && Objects.equals(strIngredient11, meal.strIngredient11) && Objects.equals(strIngredient12, meal.strIngredient12) && Objects.equals(strIngredient13, meal.strIngredient13) && Objects.equals(strIngredient14, meal.strIngredient14) && Objects.equals(strIngredient15, meal.strIngredient15) && Objects.equals(strIngredient16, meal.strIngredient16) && Objects.equals(strIngredient17, meal.strIngredient17) && Objects.equals(strIngredient18, meal.strIngredient18) && Objects.equals(strIngredient19, meal.strIngredient19) && Objects.equals(strIngredient20, meal.strIngredient20) && Objects.equals(strMeasure1, meal.strMeasure1) && Objects.equals(strMeasure2, meal.strMeasure2) && Objects.equals(strMeasure3, meal.strMeasure3) && Objects.equals(strMeasure4, meal.strMeasure4) && Objects.equals(strMeasure5, meal.strMeasure5) && Objects.equals(strMeasure6, meal.strMeasure6) && Objects.equals(strMeasure7, meal.strMeasure7) && Objects.equals(strMeasure8, meal.strMeasure8) && Objects.equals(strMeasure9, meal.strMeasure9) && Objects.equals(strMeasure10, meal.strMeasure10) && Objects.equals(strMeasure11, meal.strMeasure11) && Objects.equals(strMeasure12, meal.strMeasure12) && Objects.equals(strMeasure13, meal.strMeasure13) && Objects.equals(strMeasure14, meal.strMeasure14) && Objects.equals(strMeasure15, meal.strMeasure15) && Objects.equals(strMeasure16, meal.strMeasure16) && Objects.equals(strMeasure17, meal.strMeasure17) && Objects.equals(strMeasure18, meal.strMeasure18) && Objects.equals(strMeasure19, meal.strMeasure19) && Objects.equals(strMeasure20, meal.strMeasure20) && Objects.equals(strSource, meal.strSource) && Objects.equals(strImageSource, meal.strImageSource) && Objects.equals(strCreativeCommonsConfirmed, meal.strCreativeCommonsConfirmed) && Objects.equals(dateModified, meal.dateModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMeal, strMeal, strDrinkAlternate, strCategory, strArea, strInstructions, strMealThumb, strTags, strYoutube, strIngredient1, strIngredient2, strIngredient3, strIngredient4, strIngredient5, strIngredient6, strIngredient7, strIngredient8, strIngredient9, strIngredient10, strIngredient11, strIngredient12, strIngredient13, strIngredient14, strIngredient15, strIngredient16, strIngredient17, strIngredient18, strIngredient19, strIngredient20, strMeasure1, strMeasure2, strMeasure3, strMeasure4, strMeasure5, strMeasure6, strMeasure7, strMeasure8, strMeasure9, strMeasure10, strMeasure11, strMeasure12, strMeasure13, strMeasure14, strMeasure15, strMeasure16, strMeasure17, strMeasure18, strMeasure19, strMeasure20, strSource, strImageSource, strCreativeCommonsConfirmed, dateModified);
    }
}
