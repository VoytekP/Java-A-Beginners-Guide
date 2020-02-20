package academy.learnprogramming;
/*
Count number of spaces
 */

public class SelfTest1 {

    public static void main(String[] args)
    throws java.io.IOException{

        char characters;
        int spaces = 0;

        System.out.println("Enter a period to stop.");

        do {
            characters = (char) System.in.read();
            if (characters == ' ' ) spaces++;
        } while (characters != '.');

        System.out.println("Spaces: " + spaces);
    }
}
