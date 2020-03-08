package academy.learnprogramming;

public class PassObRef {
    public static void main(String[] args) {
        Test2 ob = new Test2(12,20);

        System.out.println("oba and ob.b before call: " +
                ob.a + " " + ob.b);

        ob.change(ob);

        System.out.println("ob.a and ob.b after call: " +
                ob.a + " " + ob.b);
    }
}
