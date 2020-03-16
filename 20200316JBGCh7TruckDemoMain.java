package academy.learnprogramming;

public class TruckDemo {
    public static void main(String[] args) {
        // construct some trucks

        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        double gallons;
        int dist = 252;

        gallons = semi.fuelneeded(dist);

        System.out.println("Semi can carry " + semi.getCargocap() +
                            " pounds.");
        System.out.println("To go " + dist + " miles semi needs " +
                            gallons + " gallons of fuel.\n");

        gallons = pickup.fuelneeded(dist);

        System.out.println("Pickup can carry " + pickup.getCargocap() +
                            " pounds.");
        System.out.println("To go " + dist + " miles pickup needs " +
                            gallons + " gallons of fuel.");
    }
}
