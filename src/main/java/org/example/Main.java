package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(uppercaseChecker("wwwwWkkkKKK"));
    }

    public static boolean passwordLengthCheck(String password) {
        return password.length() >= 8;
    }

    public static boolean passwordIncludeDigitCheck(String password) {
        for(int i=0; i<password.length(); i++) {
        if(Character.isDigit(password.charAt(i))) {
            return true;
        }
    }
        return false;
    };

    public static boolean uppercaseChecker(String password) {
        for(int i=0;i<password.length(); i++) {
            if(Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
            return false;
    };

    public static boolean LowercaseChecker(String password) {
        for (int i=0; i< password.length();i++){
            if(Character.isLowerCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}