package academy.learnprogramming;

// Build a subclass of Vehicle for trucks

public class Vehicle {
    private int passengers;     // number of passengers
    private int fuelcap;        // fuel capacity in gallons
    private int mpg;            // fuel consumption in miles per gallon

    // This is a constructor for Vehicle.
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Return th e range
    int range () {
        return mpg * fuelcap;
    }

    // Compute fuel needed for a given distance.
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

    // Accessor methods for instance variables.
    int getPassengers() {return passengers; }
    void setPassengers(int p) {passengers = p; }
    int getFuelcap() { return fuelcap;}
    void setFuelcap(int f) { fuelcap = f;}
    int getMpg() { return mpg; }
    void setMpg(int m) { mpg = m; }
}
