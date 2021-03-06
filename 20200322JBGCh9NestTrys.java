package javabeginners;
// Use a nested try block.
public class NestTrys {
    public static void main(String[] args) {
        // Here, number is longer then denom
        int number[] = {4, 8, 16, 32, 128, 256, 512};
        int denom[] = {2, 0, 4, 4, 0, 8};

        try { // outer try
            for (int i = 0; i < number.length; i++) {
                try { // nested try
                    System.out.println(number[i] + " / " +
                            denom[i] + " is " +
                            number[i] / denom[i]);
                } catch (ArithmeticException exc) {
                    // catch the exception
                    System.out.println("Can't divide by Zero!");
                }
            }
        
                } catch (ArrayIndexOutOfBoundsException exc) {
            // catch the exception
            System.out.println("No matching element found.");
            System.out.println("Fatal error - program terminated.");
        }
    }
}
