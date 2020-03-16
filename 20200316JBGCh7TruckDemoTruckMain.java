package academy.learnprogramming;

public class Truck extends Vehicle {
    private int cargocap; // cargo capacity in pounds

    Truck(int p, int f, int m, int c) {
        /*
        Initialize Vehicle members using
        Vehicle's constructor.
         */
        super(p, f, m);

        cargocap = c;
    }

    // Accessor methods for cargocap.
    int getCargocap() {return cargocap; }
    void putCargo(int c) { cargocap = c;}
}
