package javabeginners;

public class ReThrowDemo {
    public static void main(String[] args) {
        try {
            Rethrow.genException();
        } catch (ArrayIndexOutOfBoundsException exc) {
            // re-catch exception
            System.out.println("Fatal error - " +
                                "program terminated.");
        }
    }
}
