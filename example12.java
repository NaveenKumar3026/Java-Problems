import java.util.Scanner;

class example12
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the score: ");
        int score = scan.nextInt();
        if(score>35 && score<60)
        {
            System.out.print("You get video game");
        }
        else if(score>=60 && score<90)
        {
            System.out.print("You get iPhone");
        }
        else if(score>=90)
        {
            System.out.print("You get Macbook pro");
        }
    }
}