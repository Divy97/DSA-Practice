package concepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LearnHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 120);
        map.put("USA", 30);
        map.put("China", 150);

        System.out.println(map);

        if (map.containsKey("China")) {
            System.out.println("China exists");
        }

        System.out.println(map.get("India"));

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        Set<String> keys = map.keySet();
        for(String key: keys) {
            System.out.print(key + " ");
        }
    }
}
