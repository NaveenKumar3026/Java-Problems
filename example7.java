import java.util.Scanner;

class example7
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the student name: ");
        String name= scan.nextLine();
        System.out.print("Enter the student mark out of hundred: ");
        float marks= scan.nextFloat();
        scan.nextLine();
        System.out.print("Enter the student department name: ");
        String department= scan.nextLine();
        System.out.println("Displaying the student informations\n\tMy name is "+name);
        System.out.println("\tMy score is "+marks/10 +"/10");
        System.out.print("\tMy department is "+department);
    }
}