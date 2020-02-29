package academy.learnprogramming;

public class VarDemo2 {
    public static void main(String[] args) {
        var mc = new MyClass(10); // Notice the use of var here.

        System.out.println("Value of I in mc is " + mc.getI());
        mc.setI(19);
        System.out.println("Value of I in mc is now " + mc.getI());
    }
}
