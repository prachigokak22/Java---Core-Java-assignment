//MethodOverriding.java

// Parent class
class Employee {

    void work() {
        System.out.println("Employee is working");
    }
}

// Child class 1
class Manager extends Employee {

    @Override
    void work() {
        System.out.println("Manager manages the team");
    }
}

// Child class 2
class Developer extends Employee {

    @Override
    void work() {
        System.out.println("Developer writes code");
    }
}
public class  MethodOverriding{
    public static void main(String[] args) {
         // Parent reference
        Employee e;

        // Object of Manager
        e = new Manager();
        e.work();

        // Object of Developer
        e = new Developer();
        e.work();
    }
}