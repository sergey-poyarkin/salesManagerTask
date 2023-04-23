import Account.SalesManager;

public class Main {
    public static void main(String[] args) {

        SalesManager person1 = new SalesManager(new long[]{4, 8, 12, 2, 6});
        System.out.println("Max: " + person1.max());
        System.out.println("Trimmed average: " + person1.trimAverage());
    }
}