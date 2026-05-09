import java.util.Scanner;

class example14
{
    public static void main(String args[])
    {       
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the mark for subject 1: ");
        Float sub1= scan.nextFloat();
        System.out.print("Enter the mark for subject 2: ");
        Float sub2= scan.nextFloat();
        System.out.print("Enter the mark for subject 3: ");
        Float sub3= scan.nextFloat();
        System.out.print("Enter the mark for subject 4: ");
        Float sub4= scan.nextFloat();
        System.out.print("Enter the mark for subject 5: ");
        Float sub5= scan.nextFloat();
        float avg = (sub1 + sub2 + sub3 + sub4 + sub5)/5;
        if(avg<35)
        {
            System.out.print("Additional class is required");
        }
        else
        {
            System.out.print("Good to go");
        }
    }
}