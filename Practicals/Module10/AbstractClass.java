// AbstractClass.java

abstract class Shape {

    String color; // 🔹 variable in parent

    // constructor
    Shape(String color) {
        this.color = color;
    }

    abstract void draw();

    void message() {
        System.out.println("This is Shape class");
    }
}

// Child class 1
class Circle extends Shape {

    double radius; // 🔹 specific variable

    Circle(String color, double radius) {
        super(color); // parent constructor call
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing Circle with color: " + color + " and radius: " + radius);
    }
}

// Child class 2
class Rectangle extends Shape {

    int length, width; // 🔹 specific variables

    Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    void draw() {
        System.out.println("Drawing Rectangle with color: " + color +
                           " length: " + length + " width: " + width);
    }
}

public class AbstractClass {
    public static void main(String[] args) {

        // 🔥 Runtime Polymorphism
        Shape s;

        s = new Circle("Red", 5.5);
        s.draw();
        s.message();

        System.out.println();

        s = new Rectangle("Blue", 10, 5);
        s.draw();
        s.message();
    }
}