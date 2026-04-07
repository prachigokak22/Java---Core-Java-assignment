import java.util.*;

public class ListProgramme {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Prachi");
        arrayList.add("Aman");
        arrayList.add("Riya");

        System.out.println("ArrayList Elements:");
        for (String name : arrayList) {
            System.out.println(name);
        }

        
        System.out.println("First Element: " + arrayList.get(0));


        
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Mango");

      
        linkedList.addFirst("Orange");
        linkedList.addLast("Grapes");

        System.out.println("\nLinkedList Elements:");
        for (String item : linkedList) {
            System.out.println(item);
        }


        linkedList.remove("Banana");

        System.out.println("\nAfter Removing Banana:");
        System.out.println(linkedList);
    }
}