package beginnersjavaguide;
// Autoboxing/unboxing takes place with
// method parameters and return values.

public class AutoBox2 {
    // This method has an Integer parameter.
    static void m(Integer v) {
        System.out.println("m () received " + v);
    }

    // This method returns an int.
    static int m2() {
        return 10;
    }

    // This method returns an Integer.
    static Integer m3() {
        return 99;  // autoboxing 99 into an Integer.
    }

    public static void main(String[] args) {

        // Pass an int to m(). Because m() has an Integer
        // parameter, the int value passed is automatically boxed.
        m(199);

        Integer iOb = m2();
        System.out.println("Return value from m2() is " + iOb);

        int i = m3();
        System.out.println("Return value from m3() is " + i);

        iOb = 100;
        System.out.println("Square root of iOb is " + Math.sqrt(iOb));
    }
}
