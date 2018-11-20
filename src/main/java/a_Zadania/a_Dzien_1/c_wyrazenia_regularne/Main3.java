package a_Zadania.a_Dzien_1.c_wyrazenia_regularne;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main3 {
    private static final String REGEX = "(\\d(\\s[-/\\+\\*]\\s)?)*";

    public static void main(String[] args)  {
        File file = new File("src/a_Zadania/a_Dzien_1/c_wyrazenia_regularne/operations.txt");
        System.out.println(file.getAbsolutePath());
        try (FileWriter writer = new FileWriter(file, true); Scanner scan = new Scanner(System.in)) {
            while (scan.hasNextLine()) {
                String input = scan.nextLine();
                if (input.equals("quit")) {
                    break;
                }
                if (Pattern.matches(REGEX, input)) {
                    writer.append(input + " = " + calc(input.split(" ")) + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int calc(String[] splited) {
        int result = Integer.parseInt(splited[0]);
        for (int i = 1; i < splited.length; i++) {
            if (i % 2 != 0) {
                int num = Integer.parseInt(splited[i + 1]);

                switch (splited[i++]) {
                    case "+": {
                        result += num;
                        break;
                    }
                    case "-": {
                        result -= num;
                        break;
                    }
                    case "*": {
                        result *= num;
                        break;
                    }
                    case "/": {
                        result /= num;
                        break;
                    }
                }
            }
        }
        return result;
    }

}