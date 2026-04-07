import java.io.*;

// Class must implement Serializable
class Student implements Serializable {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerializationDemo {
    public static void main(String[] args) {

        // 🔹 Serialization (object → file)
        try {
            Student s1 = new Student(1, "Prachi");

            FileOutputStream fos = new FileOutputStream("student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s1);

            oos.close();
            fos.close();

            System.out.println("Object Serialized Successfully");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        // 🔹 Deserialization (file → object)
        try {
            FileInputStream fis = new FileInputStream("student.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s2 = (Student) ois.readObject();

            ois.close();
            fis.close();

            System.out.println("\nObject Deserialized Successfully");
            System.out.println("ID: " + s2.id);
            System.out.println("Name: " + s2.name);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e);
        }
    }
}