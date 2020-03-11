package academy.learnprogramming;

public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("Factorials using recursive method.");
        System.out.println("Factorial of 1 is " + f.factR(1));
        System.out.println("Factorial of 2 is " + f.factR(2));


        System.out.println("Factorial of 3 is " + f.factR(3));
        System.out.println("Factorial of 4 is " + f.factR(4));
        System.out.println("Factorial of 5 is " + f.factR(5));
        System.out.println();

        System.out.println("Factorials using iterative method.");
        System.out.println("Factorial of 1 is " + f.factI(1));
        System.out.println("Factorial of 2 is " + f.factI(2));

        System.out.println("Factorial of 3 is " + f.factI(3));
        System.out.println("Factorial of 4 is " + f.factI(4));
        System.out.println("Factorial of 5 is " + f.factI(5));
    }
}
