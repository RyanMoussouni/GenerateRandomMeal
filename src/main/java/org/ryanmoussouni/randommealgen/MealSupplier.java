package org.ryanmoussouni.randommealgen;

public interface MealSupplier {
    Meal getMeal() throws MealGenerationError;
}
