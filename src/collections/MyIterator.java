package collections;

import java.util.*;

//Перебор Map через Set при помощи Iterator.
public class MyIterator {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Kate", 1);
        map.put("Sveta", 2);

        Set<String> keys = new HashSet<>(map.keySet());
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String stringKey = iterator.next();
            System.out.println(stringKey + " " + map.get(stringKey));
        }

    }
}
