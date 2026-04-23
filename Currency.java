import java.util.Scanner;

public class Currency
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of money: ");
        int money = scan.nextInt();
        int[] arr = {2,5,10,20,50,100,500,2000};
        int i, num;
        while(true)
        {
            for(i=0;i<8;i++)
            {
                int num1 = money/arr[i];
                if(num1==0)
                {
                    break;
                }
            }
            num = money/arr[i-1];
            System.out.println(num +" "+ (arr[i-1]) + "rupees note");
            money%=arr[i-1];
            if(money==0 || money==1)
            {
                if(money==1)
                {
                    System.out.println("One one rupee note");
                }
                break;
            }
        }
     }
}