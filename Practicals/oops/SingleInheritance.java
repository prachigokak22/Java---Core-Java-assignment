// SingleInheritance.java

class Animal{
    void eat(){

        System.out.println("Animal eats food");
    }
}

class Dogn extends  Animal{
    void bark(){
        System.err.println("Dog barks");
    }

}

public class SingleInheritance{
    public static void main(String[] args) {
        Dogn d1= new Dogn();
        d1.eat();
        d1.bark();
        
    }
}

