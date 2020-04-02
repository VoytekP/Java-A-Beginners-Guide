package beginnersjavaguide;

public enum Transport2 {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}

class EnumDemo2 {
    public static void main(String[] args) {
        Transport2 tp;

        System.out.println("Here are all Transport constants");

        // use Values()
        Transport2 allTransports[] = Transport2.values();
        for (Transport2 t : allTransports)
            System.out.println(t);

        System.out.println();
        
        // use ValueOf()
        tp = Transport2.valueOf("AIRPLANE");
        System.out.println("tp contains " + tp);
    }
}
