import java.util.Scanner;

class example13
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the score: ");
        int score= scan.nextInt();
        if(score<50)
        {
            System.out.print("You need to improve");
        }
        else if(score>=50 && score<=70)
        {
            System.out.print("Good job");
        }
        else if(score>70)
        {
            System.out.print("Excellent performance");
        }
    }
}