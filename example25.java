import java.util.Scanner;

class example25
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];
        for(int i=0;i<10;i++)
        {
            System.out.print("Enter a[" +i +"]: ");
            a[i] = scan.nextInt();
        }
        System.out.println("The array elements are");
        for(int i=0;i<10;i++)
        {
            System.out.println(a[i]);
        }
    }
}