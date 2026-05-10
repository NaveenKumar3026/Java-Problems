import java.util.Scanner;

class example24
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[5];
        int sum=0;
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter a[" +i +"]: ");
            a[i]= scan.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            sum +=a[i];
        }
        System.out.print("Sum of the five integers is "+sum);
    }
}
