package org.ryanmoussouni.randommealgen;

import org.ryanmoussouni.randommealgen.Error.MealGenerationError;

public interface MealSupplier {
    Meal getMeal() throws MealGenerationError;
}
