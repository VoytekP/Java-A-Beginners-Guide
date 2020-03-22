package javabeginners;
// Handle error gracefully and continue

public class ExcDemo3 {
    public static void main(String[] args) {
        int number[] = { 4, 8, 16, 32, 64, 128};
        int denom[] = { 2, 0, 4, 4, 0, 8};

        for (int i = 0; i < number.length; i++) {
            try {
                System.out.println(number[i] + " / " +
                                    denom[i] + " is " +
                                    number[i] / denom[i]);
            } catch (ArithmeticException exc) {
                // catch the exception
                System.out.println("Cant' divide by Zero!");
            }
        }
    }
}
