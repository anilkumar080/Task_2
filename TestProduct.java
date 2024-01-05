import java.util.Scanner;

public class TestProduct
{
    public static void main(String[] args)
    {
        total();
    }
    public static int total(Product[]products)
    {
        Scanner sc=new Scanner(System.in);
        int single_product;
        System.out.println("Enter the price of product");
        int price=sc.nextInt();
        System.out.println("Enter the quantity of product");
        int quantity= sc.nextInt();
        System.out.println("Enter first product price");
        int p1=sc.nextInt();
        System.out.println("Enter second product price");
        int p2= sc.nextInt();
        System.out.println("Enter third product price");
        int p3=sc.nextInt();
        System.out.println("Enter fourth  product price");
        int p4=sc.nextInt();
        System.out.println("Enter fifth product price");
        int p5=sc.nextInt();

        int[]prodinfo={p1,p2,p3,p4,p5};

        single_product=price*quantity;
        return single_product;
    }
}
