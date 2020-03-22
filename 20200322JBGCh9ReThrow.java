package javabeginners;

public class Rethrow {
    public static void genException() {
        // here, number is longer then denom
        int number [] = { 4, 8, 16, 32, 64, 128, 256, 512 };
        int denom [] = { 2, 0, 4, 4, 0, 8 };

        for (int i = 0; i < number.length; i++) {
            try {
                System.out.println(number[i] + " / " +
                                    denom[i] + " is " +
                                    number[i] / denom[i]);
            } catch (ArithmeticException exc) {
                // catch the exception
                System.out.println("Can't divide by Zero!");
            } catch (ArrayIndexOutOfBoundsException exc) {
                // catch the exception
                System.out.println("No matching element found.");
                throw exc; // rethrow the exception
            }
        }
    }
}
