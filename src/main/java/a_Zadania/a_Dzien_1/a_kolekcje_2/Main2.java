package a_Zadania.a_Dzien_1.a_kolekcje_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main2 {

    public static void main(String[] args) {
        Map<String, String> someMap = getMap();

        Set<String> keys = someMap.keySet();

    }


    public static Map<String, String> getMap() {

        Map<String, String> map = new HashMap<>();
        map.put("black", "white");
        return map;
    }
}
