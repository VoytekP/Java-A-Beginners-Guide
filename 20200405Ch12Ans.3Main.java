package beginnersjavaguide;

public enum Tools {
    SCREWDRIVER, WRENCH, HAMMER, PLIERS
}

class ShowEnum {
    public static void main(String[] args) {
        for (Tools d : Tools.values())
            System.out.println(d + " has ordinal value of " +
                                d.ordinal() + '\n');
    }
}