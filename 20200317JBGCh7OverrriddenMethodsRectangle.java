package academy.learnprogramming;

public class Rectangle extends TwoDShape {
    // A default constructor.
    Rectangle() {
        super();
    }

    // Constructor for Rectangle.
    Rectangle(double w, double h) {
        super(w, h, "rectangle" ); // call super class constructor
    }

    // Constructor a square
    Rectangle(double x) {
        super(x, "rectangle" ); // call super class constructor
    }

    // Construct an object from an object.
    Rectangle(Rectangle ob) {
        super(ob); // pass object to TwoDShape constructor
    }

    boolean isSquare() {
        if (getWidth() == getHeight()) return true;
        return false;
    }

    // Override area() for Rectangle.
    double area() {
        return getWidth() * getHeight();
    }
}
