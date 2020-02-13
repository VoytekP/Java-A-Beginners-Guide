package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        char ch;

        ch = 'X';
        System.out.println("ch contains " + ch);

        ch++;
        System.out.println("ch is now incremented " + ch);

        ch = 90;
        System.out.println("ch is now 90 = " + ch);

        System.out.println("***************");

        boolean b;
        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);
        if (b) System.out.println("this is executed.");
        b = false;
        if (b) System.out.println("This is executed (false)");

        System.out.println("10 > 9 is " + (10 > 9));

        System.out.println("***************");

    }
}
