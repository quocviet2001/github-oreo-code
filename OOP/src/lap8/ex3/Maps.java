package lap8.ex3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {
    public static int count(Map<Integer, Integer> map) {
        return map.size();
    }

    public static void empty(Map<Integer, Integer> map) {
        map.clear();
    }

    public static boolean contains(Map<Integer, Integer> map, int key) {
        return map.containsKey(key);
    }

    public static boolean containsKeyValue(Map<Integer, Integer> map, int key, int value) {
        return map.containsKey(key) && (map.get(key) == value);
    }

    public static Set<Integer> keySet(Map<Integer, Integer> map) {
        return map.keySet();
    }

    public static Collection<Integer> values(Map<Integer, Integer> map) {
        return map.values();
    }

    public static String getColor(int value) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(0, "black");
        map.put(1, "white");
        map.put(2, "red");
        return map.get(value);
    }

    public static void main(String[] args) {
        Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        map1.put(1, 5);
        map1.put(2, 4);
        map1.put(3, 3);
        map1.put(4, 2);
        map1.put(5, 1);
        System.out.println(map1);
        System.out.println("size: " + count(map1));
        System.out.println(contains(map1, 3));
        System.out.println(containsKeyValue(map1, 1, 4));
        System.out.println(keySet(map1));
        System.out.println(values(map1));

        empty(map1);
        System.out.println(map1);
        System.out.println(getColor(2));
    }

}
