import java.util.Scanner;

class example23
{
    public static void main(String args[])
    {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the range you want to print the numbers which are divisible by 3 and 5: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("The numers which are divisible by 3 and 5 are");
        for(int i=a;i<=b;i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println(i);
            }
        }
    }
}