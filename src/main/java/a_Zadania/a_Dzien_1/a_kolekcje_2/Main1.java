package a_Zadania.a_Dzien_1.a_kolekcje_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main1 {

    public static void main(String[] args) {

        Set<String> elements = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.println("Wprowadź napis");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            count++;
            elements.add(input);
        }
        System.out.println("Podanych napisów: "+count +" " +
                ", Rozmiar kolekcji:" + elements.size());
    }
}
