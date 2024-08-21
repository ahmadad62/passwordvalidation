package org.example;

public class Main {
    public static void main(String[] args) {

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
}