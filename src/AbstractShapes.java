abstract class Shape {

    // Abstract method
    abstract void numberOfSides();
}

// Rectangle class
class Rectangle extends Shape {
    void numberOfSides() {
        System.out.println("Rectangle has 4 sides");
    }
}

// Triangle class
class Triangle extends Shape {
    void numberOfSides() {
        System.out.println("Triangle has 3 sides");
    }
}

// Hexagon class
class Hexagon extends Shape {
    void numberOfSides() {
        System.out.println("Hexagon has 6 sides");
    }
}

public class AbstractShapes {

    public static void main(String[] args) {

        // Create objects
        Shape r = new Rectangle();
        Shape t = new Triangle();
        Shape h = new Hexagon();

        // Call methods in order
        r.numberOfSides();
        t.numberOfSides();
        h.numberOfSides();
    }
}