import java.util.Scanner;


class example10
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of income: ");
        float income = scan.nextFloat();
        if(income>7000)
        {
            System.out.print("Scholarship is available");
        }
        else
        {
            System.out.print("Scholarship is not available");
        }
    }
}
