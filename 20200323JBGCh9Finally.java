package javabeginners;

public class FinallyDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            UseFinally.genException(i);
            System.out.println();
        }
    }
}
