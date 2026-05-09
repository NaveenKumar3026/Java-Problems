import java.util.Scanner;

class example17
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a= scan.nextInt();
        System.out.print("Enter the value of b: ");
        int b= scan.nextInt();
        System.out.print("The biggest of the two numbers is ");
        System.out.print(a>b?a:b);
    }
}