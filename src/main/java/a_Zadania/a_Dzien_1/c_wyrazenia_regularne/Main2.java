package a_Zadania.a_Dzien_1.c_wyrazenia_regularne;

import java.util.regex.Pattern;

public class Main2 {

    public static void main(String[] args) {
        String passp1 = "abcabcabcqq";
        String passp2 = "aA1b1cAa2qE";
//        System.out.println(verifyPassword(passp1));
        System.out.println(verifyPassword(passp2));
    }

    static boolean verifyPassword(String password) {

        String regex = ".{10,15}";
        if (!Pattern.matches(regex, password)) {
            return false;
        }
        String regex2 = ".*[a-z]{2}.*";
        if (Pattern.matches(regex2, password)) {
            return false;
        }

        return true;
    }
}
