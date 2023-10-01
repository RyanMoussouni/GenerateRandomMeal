package org.ryanmoussouni.randommealgen.business;

import org.ryanmoussouni.randommealgen.domain.Meal;
import org.ryanmoussouni.randommealgen.error.MealGenerationError;

public interface MealSupplier {
    Meal getMeal() throws MealGenerationError;
}
