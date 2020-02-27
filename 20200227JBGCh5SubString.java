package academy.learnprogramming;

public class SubStr {
    public static void main(String[] args) {
        String orgstr = "Java makes the Web move.";

        // construct a substring 

        String subst = orgstr.substring(5, 18);

        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + subst);
    }
}
