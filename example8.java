import java.util.Scanner;
 class example8
 {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter meghana is dead or alive: ");
        String meghana = scan.nextLine();
        if(meghana.equals("dead"))
        {
            System.out.print("Surya meets Ramya");
        }
        else
        {
            System.out.print("Surya weds Meghana");
        }
    }
 }