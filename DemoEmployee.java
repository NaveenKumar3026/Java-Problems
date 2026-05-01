import java.util.Scanner;

class Employee
{
    String name;
    int emp_id;
    String binary_emp_id;
    String hex_emp_id;
    boolean isPermanent;
    
    Employee(String name, int id, boolean isPermanent)
    {
        this.name = name;
        emp_id = id;
        this.isPermanent=isPermanent;
        binary_emp_id = Integer.toBinaryString(emp_id);
        hex_emp_id= Integer.toHexString(emp_id);

    }

    void display()
    {
        System.out.println("\nEmployee name: "+ name);
        System.out.println("Employee id: "+emp_id);
        System.out.println("Is permanent: "+isPermanent);
        System.out.println("Employee id in binary format:"+binary_emp_id);
        System.out.println("Employee id in hexadecimal format:"+hex_emp_id+"\n");
    }

}

public class DemoEmployee
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the employee: ");
        int size = scan.nextInt();
        scan.nextLine();

        Employee[] e = new Employee[size];

        for(int i=0;i<size;i++)
        {
            System.out.println("For Employee"+(i+1));
            System.out.println("Enter the name: ");
            String ename = scan.nextLine();
            System.out.println("Enter id: ");
            int eid = scan.nextInt();
            System.out.println("Employee is permanent(true/false)?: ");
            boolean permanent = scan.nextBoolean();
            scan.nextLine();
            e[i] = new Employee(ename, eid, permanent);
        }

        for(int i=0;i<size;i++)
        {
            System.out.println("\nFor Employee"+(i+1));
            e[i].display();
        }
    }
}