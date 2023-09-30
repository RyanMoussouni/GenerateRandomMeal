package org.ryanmoussouni.randommealgen;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MealsDTO {
    @JsonProperty
    private List<Meal> meals;


    public List<Meal> getMeals() {
        return this.meals;
    }
}
