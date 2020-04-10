package beginnersjavaguide;

public interface MyValue {
    double getValue();
}

interface MyParamValue {
    double getValue(double v);
}

class LambdaDemo {
    public static void main(String[] args) {
        MyValue myValue;  // declare an interface reference

        // Here, the lambda expression is simply a constant expression.
        // When it is assigned to myVal, a class instance is
        // constructed in which the lambda expession implements
        // the getValue() method in myValue.
        myValue = () -> 98.6;

        System.out.println("A constant value: " + myValue.getValue());

        MyParamValue myPval = (n) -> 1.0 / n;

        System.out.println("Reciprocal of 4 is " + myPval.getValue(4.0));
        System.out.println("Reciprocal of 8 is " + myPval.getValue(8.0));


    }
}
