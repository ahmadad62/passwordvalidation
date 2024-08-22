package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(validateAndGeneratePassword(12));

    }

    public static boolean passwordLengthCheck(String password) {
        //TODO length should be change to interactive
        return password.length() >= 12;
    }

    public static boolean passwordIncludeDigitCheck(String password) {
        for(int i=0; i<password.length(); i++) {
        if(Character.isDigit(password.charAt(i))) {
            return true;
        }
    }
        return false;
    }

    public static boolean uppercaseChecker(String password) {
        for(int i=0;i<password.length(); i++) {
            if(Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
            return false;
    }

    public static boolean LowercaseChecker(String password) {
        for (int i=0; i< password.length();i++){
            if(Character.isLowerCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static String RandomPasswordGenerator(int length) {
        StringBuilder password= new StringBuilder(length);
        Random random = new Random();

        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialCharacters = "!@#$%^&*()";
        String digits = "0123456789";

        // Ensure at least one character from each category
        password.append(lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length())));
        password.append(upperCaseLetters.charAt(random.nextInt(upperCaseLetters.length())));
        password.append(specialCharacters.charAt(random.nextInt(specialCharacters.length())));
        password.append(digits.charAt(random.nextInt(digits.length())));

        String allCharacter= lowerCaseLetters + upperCaseLetters + specialCharacters + digits;
        for (int i=4;i<length;i++) {
          char randomChar=  allCharacter.charAt(random.nextInt(allCharacter.length()));
          password.append(randomChar);
        }

        // Shuffle the password to ensure randomness
        for (int i = 0; i < password.length(); i++) {
            int randomIndex = random.nextInt(password.length());
            char temp = password.charAt(i);
            password.setCharAt(i, password.charAt(randomIndex));
            password.setCharAt(randomIndex, temp);
        }
        return password.toString();

    }

    public static String validateAndGeneratePassword(int length) {

        String password= RandomPasswordGenerator(length);
        System.out.println("Password: " + password);
        System.out.println("Password Length: " + (passwordLengthCheck(password)? "Passed":"Failed"));
        System.out.println("Password Include Digit Check: " + (passwordIncludeDigitCheck(password) ? "Passed" : "Failed"));
        System.out.println("Uppercase Checker: " + (uppercaseChecker(password) ? "Passed" : "Failed"));
        System.out.println("Lowercase Checker: " + (LowercaseChecker(password) ? "Passed" : "Failed"));
        return password;
    }


}