package a_Zadania.a_Dzien_1.c_wyrazenia_regularne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1 {

    public static void main(String[] args) {
        System.out.println(verifyEmail("arek@coderslab.pl"));
        System.out.println(verifyEmail("arejozwiak"));
    }

    static boolean verifyEmail(String email) {

        String regex = "[_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.([a-zA-Z]{2,}){1}";
        Pattern compiledPattern = Pattern.compile(regex);
        Matcher matcher = compiledPattern.matcher(email);
        return matcher.matches();
    }
}
