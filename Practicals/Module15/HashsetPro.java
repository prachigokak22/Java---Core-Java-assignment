import java.util.*;

public class HashsetPro {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);

        System.out.println("Original List: " + list);

        HashSet<Integer> set = new HashSet<>(list);

        System.out.println("After Removing Duplicates: " + set);
    }
}