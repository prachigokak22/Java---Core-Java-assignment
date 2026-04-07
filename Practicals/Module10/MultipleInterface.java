// MultipleInterface.java 

// Java me multiple inheritance (class se) possible nahi hai ❌
// 👉 But multiple interfaces implement kar sakte hain

interface printable{
    void print();

}

interface showable{
    void show();

}

class demo implements  printable,showable{

    @Override
    public void print() {
        System.out.println("Printing ");
    }

    @Override
    public void show() {
        System.out.println("Showing");
    }
    
}

public class MultipleInterface{
    public static void main(String[] args) {

        demo d1 = new demo();
        d1.print();
        d1.show();

    // upcasting interface reference for object create

        printable p1= new demo();
        p1.print();

        showable s1= new demo();
        s1.show();
        
    }
}