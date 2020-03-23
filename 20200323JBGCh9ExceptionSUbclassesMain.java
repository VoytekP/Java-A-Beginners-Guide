package javabeginners;

public class CustomExceptDemo {
        public static void main(String[] args) {
            // Here, number contains some odd values.
            int number[] = { 4, 8, 15, 32, 64, 127, 256, 512 };
            int denom[] = { 2, 0, 4, 4, 0, 8 };

            for (int i = 0; i < number.length; i++) {
                try {
                    if ((number[i] % 2) != 0)
                        throw new NonIntResultException(number[i], denom[i]);

                    System.out.println(number[i] + " / " +
                                        denom[i] + " is " +
                                        number[i] / denom[i]);
                } catch (ArithmeticException exc) {
                    // catch the exception
                    System.out.println("Can't divide by Zero!");
                } catch (ArrayIndexOutOfBoundsException exc) {
                    // catch the exception
                    System.out.println("No matching element found.");
                } catch (NonIntResultException exc) {
                    System.out.println(exc);
                }
        }
    }
}
