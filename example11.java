import java.util.Scanner;

class example11
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int num = scan.nextInt();
        if(num%3==0 && num%5==0)
        {
            System.out.print("The number "+ num + " is divisible by both 3 and 5");
        }
        else
        {
            System.out.print("The number "+ num + " is not divisible by both 3 and 5");
        }
    }
}