import java.lang.System;
import java.util.Scanner;

class example3
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a= input.nextInt();
        System.out.print("Enter the value of b: ");
        int b= input.nextInt();
        System.out.print("Sum of the two numbers is ");
        System.out.print(a+b);
    }
}