package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;

        // for loop - standard
//        for (int i = 0; i < 10; i++)
//            sum += nums[i];
//        System.out.println(sum);

        // for-each style loop
        for (int x: nums) {
            System.out.println("Value is: " + x);
            sum += x;
        }
        System.out.println("Summation: " + sum);

    }
}
