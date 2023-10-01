package org.ryanmoussouni.randommealgen;

import org.ryanmoussouni.randommealgen.domain.Meal;
import org.ryanmoussouni.randommealgen.error.MealGenerationError;

public interface MealSupplier {
    Meal getMeal() throws MealGenerationError;
}
