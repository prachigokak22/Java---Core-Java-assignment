// Staticvarmethod.java


class Student {
    int id;
    String name;

    static  String collage ="Parul University";

    public Student(int id,String n) {
        this.id=id;
        this.name=n;
    }

    static void changecollage(){
        collage = "Indian institute of Technology";
    }

    public void display(){
        System.out.println("id :"+id+" "+"name :"+name + " "+"collage :"+collage);
    }

}

public class Staticvarmethod{
    public static void main(String [] args){
        Student.changecollage();
        Student s1 = new Student(1, "Prachi");
        Student s2 = new Student(2, "Aman");


        s1.display();
        s2.display();

    }
}