import java.util.Scanner;

class example16
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the person's salary and age: ");
        float salary= scan.nextFloat();
        int age= scan.nextInt();
        if(salary>=20000 || age<=25)
        {
            System.out.print("Enter the required loan amount");
            float loan = scan.nextFloat();
            if(loan<=50000)
            {
                System.out.print("You are eligible for loan");
            }
            else
            {
                System.out.print("Maximum loan amount is 50000");

            }
        }
        else
        {
            System.out.print("You are not eligible for loan");
        }
    }
}