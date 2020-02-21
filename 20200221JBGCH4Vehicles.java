package academy.learnprogramming;

public class Vehicle {

        int passengers; // number of passengers
        int fuelcap;    // fuel capacity in gallons
        int mpg;        // fuel consumpitn in miles per gallon

        // Display the range.
        void range() {
            System.out.println("Range is " + fuelcap * mpg);
        }
}
