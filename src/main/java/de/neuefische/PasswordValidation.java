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
}
