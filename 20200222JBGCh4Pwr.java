package academy.learnprogramming;

public class Pwr {
    double b;
    int e;
    double val;

//    Pwr (double base, int exp) {
//        b = base;
//        e = exp;
//
//        val = 1;
//        if (exp == 0) return;
//        for ( ; exp > 0; exp--)
//            val = val * base;
//    }

    Pwr(double b, int e) {
        this.b = b;
        this.e = e;

        val = 1;
        if (e == 0) return;
        for ( ; e > 0; e--) val = val *b;
    }

    double get_pwr() {
        return this.val;
    }
}
