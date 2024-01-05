import java.util.Scanner;

public class AccountTest
{
    public static void main(String[] args) {
        Account ac=new Account();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter available balance");
        ac.balance=s.nextInt();
        System.out.println("Amoubnt to be withdrawn");
        ac.amountwithdraw=s.nextInt();

        ac.deposit();
        ac.withdraw();
        ac.display();
    }
}
