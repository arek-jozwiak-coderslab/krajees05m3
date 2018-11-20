package a_Zadania.a_Dzien_1.a_kolekcje_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main1 {

    public static void main(String[] args) {

        List<Integer> elements = new ArrayList<>();

        for (int i = 10; i < 20; i++) {
            elements.add(i);
        }
        //1.
        for (int i = 0; i < elements.size(); i++) {
            System.out.println(elements.get(i));
        }
        //2.
        Iterator<Integer> iterator = elements.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //3.
        for (Iterator<Integer> iterator2 = elements.iterator(); iterator2.hasNext(); ) {
            System.out.println(iterator.next());
        }

        // 4.
        for (Integer element : elements) {
            System.out.println(element);
        }

    }
}
