import java.lang.System;
import java.util.Scanner;

class example4
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the person's name: ");
        String name= input.nextLine();
        System.out.print("Enter the person's age: ");
        int age=input.nextInt();
        input.nextLine();
        System.out.print("Enter the person's address: ");
        String address= input.nextLine();
        System.out.print("Person name: ");
        System.out.print(name);
        System.out.print("\nPerson age: ");
        System.out.print(age);
        System.out.print("\nPerson address: ");
        System.out.print(address);
    }
}