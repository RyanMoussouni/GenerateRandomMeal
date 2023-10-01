package org.ryanmoussouni.randommealgen;

import org.ryanmoussouni.randommealgen.error.MealGenerationError;

public interface MealSupplier {
    Meal getMeal() throws MealGenerationError;
}
