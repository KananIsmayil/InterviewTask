package com.TaskPractice;

public class passwordValidationTask {

        public static void main(String[] args) {

            String pasw = "Marvelous1$";
            System.out.println("ValidatePassword(pasw) = " + ValidatePassword(pasw));
            System.out.println("ValidatePassword(\"Vidosava&7%\") = " + ValidatePassword("Vidosava&7%"));
            System.out.println("ValidatePassword(\"bob#\") = " + ValidatePassword("bob#"));
//        CONSOLE OUTPUT:
//ValidatePassword(pasw) = true
//ValidatePassword("Vidosava&7%") = true
//ValidatePassword("bob#") = false
        }
        //"Write a return method that can verify if a password is valid or not. Requirements:
//1. Password MUST be at least 6 characters and should not contain space
//2. Password should at least contain one upper case letter
//3. Password should at least contain one lowercase letter
//4. Password should at least contain one special characters
//5. Password should at least contain a digit
//6. if all requirements above are met, the method returns true, otherwise returns false"
        public static boolean ValidatePassword(String password){

            boolean hasUpperC=false, hasLowerC=false,hasSpecialChar = false,hasDigit = false;
            boolean rightLength = password.length()>=6;
//        char

            for(int i= 0; i< password.length(); i++){
                char v=password.charAt(i);
                if(Character.isUpperCase(v)){
                    hasUpperC = true;
                }else if(Character.isLowerCase(v)){
                    hasLowerC=true;
                }else if (Character.isDigit(v)){
                    hasDigit = true;
                }else{
                    hasSpecialChar = true;
                }
            }
            return hasDigit&&hasDigit&&hasUpperC&&hasSpecialChar&&rightLength;
        }
    }

