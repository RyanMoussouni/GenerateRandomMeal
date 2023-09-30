package org.ryanmoussouni.randommealgen;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MealsDTO {
    @JsonProperty
    private List<Meal> meals;
}
