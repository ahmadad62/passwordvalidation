package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MainTest {

    @Test
    void isPasswordLengthEightOrMore(){
        //Given
        String password1 = "short";
        String password2 = "sufficient";
        //When
        boolean result1=Main.passwordLengthCheck(password1);
        boolean result2=Main.passwordLengthCheck(password2);
        //Then
        assertFalse(result1,"Password length check failed");
        assertTrue(result2,"Password length is more than 8 characters and result is true");
    }

    @Test
    void isPasswordIncludeDigits(){
        String password1 = "password12";
        String password2 = "passwordabdc";

        boolean result1=Main.passwordIncludeDigitCheck(password1);
        boolean result2=Main.passwordIncludeDigitCheck(password2);

        assertTrue(result1,"Password include digits check is ok");
        assertFalse(result2,"Password include digits check failed");
    }

    @Test
    void isUppercaseIsInclude(){
            String password1 = "password123";
            String password2 = "Password123";

        boolean result1=Main.uppercaseChecker(password1);
        boolean result2=Main.uppercaseChecker(password2);

        assertFalse(result1,"Uppercase checker is not ok");
        assertTrue(result2,"Uppercase checker is ok");

    }

    @Test
    void isLowercaseIsInclude(){
        String password1 = "PASSWORD1";
        String password2 = "Aa345678";

        boolean result1=Main.LowercaseChecker(password1);
        boolean result2=Main.LowercaseChecker(password2);

        assertFalse(result1,"Lowercase checker is not ok");
        assertTrue(result2,"Lowercase checker is ok");
    }

}