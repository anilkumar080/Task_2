import java.util.Scanner;

public class Person
{
    public int age;

    public String name;

    //method to display name and age
    public void display()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name of the person is:"+name);
        String name=sc.nextLine();
        System.out.println("Enter the Age of the person is:"+age);
        int age=sc.nextInt();
    }


    public static void main(String[] args) {
        Person p=new Person();


    }
}
