import java.util.Scanner;

class example9
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the student mark for out of hundred: ");
        int mark = scan.nextInt();
        if(mark>=35)
        {
            System.out.print("Student pass");
        }
        else
        {
            System.out.print("Student fail");
        }
    }
}