

    class Student{
        String name;
        int stuAge;
        
    void display(){
         System.out.println("Name :"+name);
         System.out.println("Age :"+stuAge);
    }
    }

public class StudentMethod{

    public static void main(String[] args) {
        Student s1= new Student();
        s1.name = "Prachi";
        s1.stuAge=23;
        s1.display();

        
    }
}