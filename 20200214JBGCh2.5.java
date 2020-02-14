package academy.learnprogramming;

public class LogicalOpTable {
    public static void main(String[] args) {
        int p, q, p1, q1;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = 1; q = 0;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (q));

        p1 = 1; q1 = 0;
        System.out.print(p1 + "\t" + q1 + "\t");
        System.out.print((p1&q1) + "\t" + (p1|q1) + "\t");
        System.out.println((p1^q1) + "\t" + (q1));
    }
}
