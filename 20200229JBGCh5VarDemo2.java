package academy.learnprogramming;

public class MyClass {
    private int I;

    MyClass(int k) {
        I = k;
    }

    int getI() {
        return I;
    }
    void setI(int k) {
        if (k >= 0)
            I = k;
    }
}
