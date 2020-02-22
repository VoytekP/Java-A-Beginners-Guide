package academy.learnprogramming;

public class Vehicle {

        int passengers; // number of passengers
        int fuelcap;    // fuel capacity in gallons
        int mpg;        // fuel consumption in miles per gallon
        int miles = 252;

//        // Display the range.
//        void range() {
//            System.out.println("Range is " + fuelcap * mpg);
//        }

        // Return the range.
        int range() {
                return mpg * fuelcap;
        }

        // Compute fuel needed for a given distance.
        double fuelneeded(int mils) {
                return (double) miles / mpg;
        }
}
