package Chuong2.Bai2_5;

public class TestAccount {
    public static void main(String[] args) {
        // Create customers
        Customer ct1 = new Customer(1001, "Khanh Nguyen",'m');
        Customer ct2 = new Customer(1002, "Khanh Quoc",'f');

        Account a1 = new Account(2020,ct1,1000);
        Account a2 = new Account(2021,ct2);
        System.out.println("Initial account states :");
        System.out.println(a1);
        System.out.println(a2);

        a1.deposit(500);
        a2.deposit(1000);
        System.out.println("After deposit :");
        System.out.println(a1);
        System.out.println(a2);

        a1.withdraw(200);
        System.out.println("After withdrawal :");
        System.out.println(a1);

        a2.withdraw(1500);
        System.out.println("After withdrawal 2 :");
        System.out.println(a2);

        System.out.println("Account details :");
        System.out.println("Account 1 - Customer Name : "+ a1.getCustomerName());
        System.out.println("Account 1 - Balance : $ "+ String.format("%.2f",a1.getBalance()));
        System.out.println("Account 2 - id : "+a2.getId());
    }
}
