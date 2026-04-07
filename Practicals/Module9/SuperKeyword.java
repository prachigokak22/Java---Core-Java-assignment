//SuperKeyword.java

class person{
    String name;

    public person(String name) {
        this.name = name;
        System.out.println("parent constr");
    }

    void show(){
        System.out.println("name:"+name);
    }
    
}

class student extends person {
    int age;
     student(String name, int age) {
        super(name); // 🔹 Call parent constructor
        this.age = age;
    }

    void display() {
        super.show(); // 🔹 Call parent method
        System.out.println("Age: " + age);
    }
}

public class SuperKeyword{
    public static void main(String [] args){
         student s = new student("Prachi", 20);
        s.display();
    }
}