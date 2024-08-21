package org.example;

public class Main {
    public static void main(String[] args) {

    }

    public static boolean passwordLengthCheck(String password) {
        return password.length() >= 8;
    }

    public static boolean passwordIncludeDigitCheck(String password) {
        int [] digits={0,1,2,3,4,5,6,7,8,9};
        if(password.include(digits))
        return true;
    }
}