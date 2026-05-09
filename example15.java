import java.util.Scanner;

class example15
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the color of the traffic light: ");
        String color= scan.nextLine();
        if(color.equals("red"))
        {
            System.out.print("Stop");
        }
        else if(color.equals("yellow"))
        {
             System.out.print("Get ready");
        }
        else if(color.equals("green"))
        {
             System.out.print("Go");
        }
        else
        {
             System.out.print("Invalid color");
        }    
        }
}
