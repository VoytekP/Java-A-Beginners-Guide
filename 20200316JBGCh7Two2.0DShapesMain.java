package academy.learnprogramming;

// Use accessor methods to set and get private members.
public class TwoDShape {
    private double width;
    private double height;

    // Accessor methods for width and height.
    double getWidth() { return width; }
    double getHeight() { return height; }

    void setWidth(double w) { width = w; }

    void setHeight(double h) { height = h; }

    void showDim() {
        System.out.println("Width and height are " +
                            width + " and " + height);
    }
}
