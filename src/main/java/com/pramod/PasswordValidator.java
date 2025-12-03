package com.pramod;

import java.util.Scanner;

public class PasswordValidator {
    private static void validatePassword(String password) throws InvalidPasswordException {
// write your logic here

        boolean status = false;
        int len = password. length();
        if (len<8){
            throw new InvalidPasswordException("Password must be at least 8 characters long");
        }

        boolean upperCase = false;
        boolean lowerCase = false;
        boolean isdigit = false;
        boolean specialCharacter = false;
        for (int i=0; i<len; i++){
            char ch = password. charAt (i);
            if(Character.isUpperCase(ch))
                upperCase = true;
            if(Character.isLowerCase(ch))
            lowerCase = true;
            if (Character.isDigit(ch))
                    isdigit = true;
            if(ch=='@'|| ch=='#'||ch=='$'||ch=='%') {
                specialCharacter = true;
            }
        }

        if (!upperCase) {
            throw new InvalidPasswordException("The Password must contain at least one upperCase letter");
        }
        if (!lowerCase) {
            throw new InvalidPasswordException("The password must contain at least one lowerCase letter");
        }
        if (!isdigit) {
            throw new InvalidPasswordException("The password must contain at lest one digit(0-9)");
        }
        if (!specialCharacter) {
            throw new InvalidPasswordException("The password must contain at least one special character (@,#,$,%, etc)");
        }


}

    // Non editable starts here
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        try {
            validatePassword(password);
            System.out.println("Password is valid.");
        } catch (InvalidPasswordException e) {
            System.out.println("Invalid Password: " + e.getMessage());
        }
    }
}
