package academy.learnprogramming;

public class BreakDemo {
    public static void main(String[] args) {
        int num;
        num = 100;

        // loop while i-squared is less then num
        for (int i = 0; i < num; i++) {
            if (i * i >= num)
                break; // terminate loop if i*i  >= 100
            System.out.print(i + " ");
        }
        System.out.println("Loop complete");
    }
}
