package academy.learnprogramming;

public class Empty3 {
    public static void main(String[] args) {
        int i;
        int sum = 0;

        for (i = 1; i <= 5; sum += i++); // no body in this loop
        // add to sum the value of sum plus i then increment i
        System.out.println("Sum is " + sum);
    }
}
