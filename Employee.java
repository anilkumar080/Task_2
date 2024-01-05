import java.util.Scanner;

public class Employee extends Person {
    Scanner sc = new Scanner(System.in);

    public void Employee()

    {
        System.out.println("Intializing person attributes");
        System.out.println("Enter Name");
        super.name = sc.nextLine();
        System.out.println("Enter age of person");
        super.age = sc.nextInt();


    }

    public void addDetails() {

        System.out.println("Enter Employee id");
        String empid = sc.nextLine();
        System.out.println("Enter employee salary");
        long salary = sc.nextLong();


    }


    public static void main(String[] args) {
        Employee e = new Employee();
        e.Employee();
        e.addDetails();

    }
}
