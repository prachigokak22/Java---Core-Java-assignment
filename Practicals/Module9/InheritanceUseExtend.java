//InheritanceUseExtend.java

class person{
    String name;
    void displayname(){
        System.out.println("name:" +name);
    }
}

class student extends  person{
    int age;
    void displayage(){
        System.out.println("age :"+age);
    }
}

public class InheritanceUseExtend {
    public static void main(String[] args) {
            student s1 = new student();
            s1.name="Prachi";
            s1.age=24;
            s1.displayage();
            s1.displayname();

    }
}