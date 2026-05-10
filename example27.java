import java.util.Scanner;

class example27
{
    public static void main(String args[])
    {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the table number you want to print : ");
        int table = scan.nextInt();
        System.out.println("Printing the " +table +"table:-");
        for(int i=1;i<=10;i++)
        {
            System.out.println(table +" x " +i +" = " +table*i);
        }
    }
}