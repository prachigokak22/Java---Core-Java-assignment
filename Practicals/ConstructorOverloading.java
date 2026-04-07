class Student{

    int age;
    String name;

    public Student() {
        name="Prachi";
        age=24;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void display(){
        System.out.println("Name :" +name+"age:"+age);
    }


}

public class  ConstructorOverloading{

    public static void main(String[] args) {
        Student s1= new Student();
        Student s2= new Student(24,"Aman");

        s1.display();
        s2.display();
        
    }
}