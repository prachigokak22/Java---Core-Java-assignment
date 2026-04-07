// MultilevelInheritance.java

class Animal{

    void eat(){
        System.err.println("Animal eats food ");
    }

}

class Dog extends Animal{

   

    void bark(){
        System.out.println("Dog barks");
    }

}

class Puppy extends  Dog{
    void weep(){
        System.out.println("Puppy weeps");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {

        Puppy p1 = new Puppy();
        p1.eat();
        p1.bark();
        p1.weep();
        
    }
}