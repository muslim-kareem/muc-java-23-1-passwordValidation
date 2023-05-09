package de.neuefische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidationTest {


    @Test
    public void checkLength_whenStringLongerThen8ReturnTrue(){
        //GIVEN
        String strToCheck = "this String much much longer then 8";

        //WHEN
        boolean actual = PasswordValidation.checkLength(strToCheck);

        //THEN
        Assertions.assertTrue(actual);
    }

    @Test
    public void checkLength_whenStringSmallerThen8ReturnFalse(){
        //GIVEN
        String strToCheck = "";

        //WHEN
        boolean actual = PasswordValidation.checkLength(strToCheck);

        //THEN
        Assertions.assertFalse(actual);
    }


    @Test
    public void containsNumbers_whenStringContainsNumbersReturnTrue(){
        //GIVEN
        String strToCheck = "lalalallalal 4";

        //WHEN
        boolean actual = PasswordValidation.containsNumbers(strToCheck);

        //THEN
        Assertions.assertTrue(actual);
    }
    @Test
    public void containsUpperCase_whenStringContainsUpperCaseReturnTrue(){
        //GIVEN
        String strToCheck = "lalalallalal  A";

        //WHEN
        boolean actual = PasswordValidation.containsUpperCase(strToCheck);

        //THEN
        Assertions.assertTrue(actual);
    }

    @Test
    public void containsSequential_whenStringContainsSequentialReturnTrue(){
        //GIVEN
        String strToCheck = "lalalallalal  12345";

        //WHEN
        boolean actual = PasswordValidation.containsSequential(strToCheck);

        //THEN
        Assertions.assertTrue(actual);
    }


}