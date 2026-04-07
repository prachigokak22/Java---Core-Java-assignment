//RuntimePoly.java


class Employye{
    void work(){
        System.out.println("Employee is working");
    }

}

class Manager extends  Employye{
    void work(){
        System.err.println("Manager manages the team");
    }
}

class Developer extends  Employye{
    void work(){
        System.err.println("Developer develop the web application");
    }
}
public class RuntimePoly {
    public static void main(String[] args) {

        Employye e = new Manager();
        e.work();

        Employye e1 = new Developer();
        e1.work();

    }
}