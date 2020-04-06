package beginnersjavaguide;

public class Gen<T> {
    T ob; // declare an object of type T

    //Pass the constructor a reference to
    // an object of type T.
    Gen(T o) {
        ob = o;
    }

    // Return ob.
    T getob() {
        return ob;
    }

    // Show type of T.
    void showType() {
        System.out.println("Type of T is " +
                            ob.getClass().getName());
    }
}

class GenDemo {
    public static void main(String[] args) {
        // Create a Gen reference for Integers.
        Gen<Integer> iOb;

        // Create a Gen<Integer> object an assign its
        // reference to IOb. Notice the use of autoboxing
        // to encapsulate the value 88 within an Integer object.

        iOb = new Gen<Integer>(88);
        
        // Show the type of data used by iOb.
        iOb.showType();

        int v = iOb.getob();
        System.out.println("Value: " + v);

        System.out.println();

        // Crate a Gen object for Stirngs
        Gen<String> strOb = new Gen<String>("Generics Test");

        strOb.showType();

        String str = strOb.getob();
        System.out.println("value: " + str);
    }
}
