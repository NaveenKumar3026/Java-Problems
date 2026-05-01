import java.util.Scanner;

public class DemoEmployeeSalary
{
    static int size = 50;
    static void info()
    {
        System.out.println("Enter 1 to continue");
        System.out.println("Enter 2 to exit");
    }
 
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
                EmployeeSalary[] e = new EmployeeSalary[size];
        int i = 0;
        int total = 0;
        info();
       
        while(true)
        {
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter the total hours worked for the week by the employee "+(i+1)+": ");
                    int value = scan.nextInt();
                    if(value<0) continue;
                    e[i]= new EmployeeSalary(value);
                    e[i].salary = e[i].getSalary();
                    i++;
                case 2:
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            if(choice==2) break;
        }
        int j=i;
       
        for(i=0;i<j;i++)
        {
            System.out.println("For employee "+(i+1)+": ");
            e[i].display();
        }
        for(i=0;i<j;i++)
        {  
            total+=e[i].salary;
        }
        System.out.println("\nTotal number of wages is "+total);
    }
}
 
class EmployeeSalary
{
    int hours_worked;
    double salary;
    static int hourly_rate=1000;
 
    EmployeeSalary(int hours)
    {
        hours_worked = hours;
    }
    double getSalary()
    {
        if(hours_worked>0)
        {
            if(hours_worked<40)
            {
                return hours_worked*hourly_rate;
            }
            double s= (hours_worked-40)*1.5*hourly_rate  + (double)40*hourly_rate;
            return s;
        }
        return 0;
    }
    void display()
    {
        System.out.println("Hours worked: "+hours_worked);
        System.out.println("Salary: "+salary);
    }
 
 
}
  
