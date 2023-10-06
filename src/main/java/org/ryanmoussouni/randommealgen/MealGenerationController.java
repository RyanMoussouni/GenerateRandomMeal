package org.ryanmoussouni.randommealgen;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.ryanmoussouni.randommealgen.business.MealSupplier;
import org.ryanmoussouni.randommealgen.domain.Meal;
import org.ryanmoussouni.randommealgen.error.MealGenerationError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Slf4j
@Controller
public class MealGenerationController {
    MealSupplier randomMealSupplier;

    @Autowired
    public void setRandomMealSupplier(MealSupplier randomMealSupplier) {
        this.randomMealSupplier = randomMealSupplier;
    }

    @RequestMapping(path = "/random", method = RequestMethod.GET)
    public ResponseEntity<String> handleRandomMeal() {
        try {
            var randomMeal = randomMealSupplier.getMeal();
            var mealObjectLiteral = tryDumpMeal(randomMeal);
            var statusCode = HttpStatus.OK;
            return new ResponseEntity<>(mealObjectLiteral, statusCode);

        } catch (MealGenerationError e) {
            //todo: log something
            return handleMealGenerationError();
        }
    }

    private String tryDumpMeal(Meal randomMeal) throws MealGenerationError {
        try {
            var objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(randomMeal);
        } catch (JsonProcessingException e) {
            throw new MealGenerationError(e);
        }
    }

    private ResponseEntity<String> handleMealGenerationError() {
        var errorCode = HttpStatus.INTERNAL_SERVER_ERROR;
        return new ResponseEntity<>(errorCode);
    }
}
