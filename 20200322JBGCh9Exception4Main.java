package javabeginners;
// Use multiple catch statements.
public class ExcDemo4 {
    public static void main(String[] args) {
        // Here, number is longer than denom.
        int number[] = { 4, 8, 16, 32, 128, 256, 512};
        int denom[] = { 2, 0, 4, 4, 0, 8};

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
            }
        }
    }
}
