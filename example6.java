import java.lang.System;
import java.util.Scanner;

class example6
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a= scan.nextInt();
        System.out.print("Enter the value of b: ");
        int b= scan.nextInt();
        System.out.print("Enter the value of b: ");
        int c= scan.nextInt();
        int d= a*b*c;
        int e= a+b+c;
        System.out.println("d= "+d);
        System.out.println("e= "+e);
        System.out.print("d/e = "+d/e);
    }
}