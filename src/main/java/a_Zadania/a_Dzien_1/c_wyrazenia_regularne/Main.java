package a_Zadania.a_Dzien_1.c_wyrazenia_regularne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Pattern compiledPattern = Pattern.compile("reg.*");

        Matcher matcher = compiledPattern.matcher("Wyrażenia regularne w Javie");

        System.out.println(matcher.find());
        System.out.println(matcher.matches());


    }
}
