package bookpack;

public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();
        System.out.println("User ID is " + obj.getUserID());
        System.out.println("Administration ID is " + obj.getAdminID());
    }
}
