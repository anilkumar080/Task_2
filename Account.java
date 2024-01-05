public class Account
{
    public int balance;
    public int amountwithdraw;

    //Default constructor
    public void Account()
    {
        System.out.println("default constructor");
    }

    //parametrized constructor
    public void Account(int bal,int amt)
    {
        this.balance=bal;
        this.amountwithdraw=amt;
    }

    public void deposit()
    {
        int totalbal=balance;
        System.out.println("The total balance is:"+" "+totalbal);
    }
    public void withdraw()
    {
        int totalbal=balance-amountwithdraw;
        System.out.println("The total balance after withdraw"+" "+totalbal);
    }
    public void display()
    {
        System.out.println("The total balance available is:"+balance);
    }
}
