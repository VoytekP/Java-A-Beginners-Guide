package academy.learnprogramming;

// Objects are passed through their references.

public class Test2 {
    int a, b;

    Test2(int i, int j) {
        a = i;
        b = j;
    }
    /*
    Pass an object. Now, ob.a and ob.b in object used
    in the call will be changed.
     */

    void change(Test2 ob) {
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}
