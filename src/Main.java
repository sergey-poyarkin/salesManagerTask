import Account.SalesManager;

public class Main {
    public static void main(String[] args) {

        SalesManager person1 = new SalesManager(new int[]{4, 8, 12, 2, 6});
        System.out.println(person1.max());
    }
}