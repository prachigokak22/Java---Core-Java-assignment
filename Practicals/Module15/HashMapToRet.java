import java.util.*;

public class HashMapToRet {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Prachi");
        map.put(2, "Aman");
        map.put(3, "Riya");

        System.out.println("HashMap Data: " + map);

        System.out.println("Value for key 2: " + map.get(2));

        if (map.containsKey(3)) {
            System.out.println("Key 3 exists with value: " + map.get(3));
        }

        System.out.println("\nAll key-value pairs:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}