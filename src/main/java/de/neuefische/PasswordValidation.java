package de.neuefische;

public class PasswordValidation {

    public static boolean checkLength(String strToCheck) {
        return  strToCheck.length() > 8;
    }

    public static boolean containsNumbers(String strToCheck) {
        char[] c = strToCheck.toCharArray();
        boolean tbr = false;
        for (int i = 0; i < c.length; i++) {
            if(Character.isDigit(c[i])){
                tbr = true;
                break;
            }
        }
        return tbr;
    }

    public static boolean containsUpperCase(String strToCheck) {

        char[] c = strToCheck.toCharArray();
        boolean tbr = false;
        for (int i = 0; i < c.length; i++) {
            if(Character.isUpperCase(c[i])){
                tbr = true;
                break;
            }
        }
        return tbr;
    }


    public static boolean containsSequential(String strToCheck) {
        char[] c = strToCheck.toCharArray();
        boolean tbr = false;
        int counter = 0;

        for (int i = 1; i < c.length; i++) {
            char charToTest = c[i - 1];
            if (charToTest + 1 == c[i]){
                counter++;
            }
            if(counter == 3){
                tbr = true;
                break;
            }
        }
        return tbr;
    }


    public static boolean checkPassword(String strToCheck){

        boolean tbr = false;


        if( checkLength(strToCheck) &&
            containsNumbers(strToCheck) &&
            containsUpperCase(strToCheck) &&
            !containsSequential(strToCheck)) {
            tbr = true;
        }
        return tbr;
    }
}
