package guide.chapter.ten;

import java.io.FileInputStream;
import java.io.IOException;

public class ShowFile3 {
    public static void main(String[] args) {
        int i;
        // First, make sure that a file name has been specifed.
        if (args.length != 1) {
            System.out.println("Usage: ShowFile3 filename");
            return;
        }
        // The following code uses try-with-resources to open a file
        // and then automatically close it when the try block is left.
        try(FileInputStream fin = new FileInputStream(args[0])) {

            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);

        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
