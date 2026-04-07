//ConstruOverloding.java

class Student {

    String name;
    int age;
    double marks;

    public Student(String n) {
        this.name = n;
        System.err.println("constructor with name: " + n);
    }

    public Student(int age) {
        this.age = age;
        System.out.println("construtor with age :" + age);
    }

    public Student(int age, String name, double marks) {
        this.age = age;
        this.marks = marks;
        this.name = name;

        System.out.println("Constructor with ml parat");

    }

    void display() {
        System.err.println("age:" + age + " " + "name :" + name + " " + "marks: " + marks);

    }

}

public class ConstruOverloding {

    public static void main(String[] args) {
        Student s1 = new Student(23);
        Student s2 = new Student("Prachi");
        Student s3 = new  Student(23, "aman", 670.89);

        s1.display();
        s2.display();
        s3.display();

    }
}
