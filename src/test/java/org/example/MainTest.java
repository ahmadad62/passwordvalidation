package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MainTest {

    @Test
    void isPasswordLengthChecker(){

        assertTrue(Main.passwordLengthCheck("shortpassword", 8), "Password should be valid for length 8");
        assertTrue(Main.passwordLengthCheck("longpassword", 8), "Password should be valid for length 8");
        assertFalse(Main.passwordLengthCheck("short", 8), "Password should be invalid for length 8");
        assertTrue(Main.passwordLengthCheck("exactly12d@f", 12), "Password should be valid for length 12");
        assertFalse(Main.passwordLengthCheck("exactly12", 15), "Password should be invalid for length 15");
        assertTrue(Main.passwordLengthCheck("", 0), "Empty password should be valid for length 0");

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
@Test
    void RandomPasswordChecker(){
    int length=12;
    for(int i=0;i<50;i++){

    String generatedPassword=Main.RandomPasswordGenerator(length);
        System.out.println(i+" "+generatedPassword);
    assertEquals(length,generatedPassword.length());
    assertTrue(Main.passwordLengthCheck(generatedPassword,length));
    assertTrue(Main.passwordIncludeDigitCheck(generatedPassword));
    assertTrue(Main.uppercaseChecker(generatedPassword));
    assertTrue(Main.LowercaseChecker(generatedPassword));
    }
}
}