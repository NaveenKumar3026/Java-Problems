import java.util.Scanner;

public class Find
{
    void EvenOrOdd(int num)
    {
        if(num%2==0)
        {
            System.out.print(num +" is a even number"); 
        }
        else
        {
            System.out.print(num +" is a odd number"); 
        }
    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scan.nextInt();
        Find obj1 = new Find();
        obj1.EvenOrOdd(num);
    }
}