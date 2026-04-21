import java.util.Scanner;
import java.util.Arrays;

public class DemoArrangeBowls{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the total number of bowls: ");
        int size = scan.nextInt();
        int[][] bowl = new int[size][2];
        int[] dp = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the length and breadth of the bowl "+(i+1)+": ");
            bowl[i][0]=scan.nextInt();
            bowl[i][1]=scan.nextInt();
        }
        Arrays.fill(dp,1);
        Arrays.sort(bowl, (a,b)->{
            if(a[0]==b[0]) return a[1]-b[1];
            return a[0]-b[0];
        });
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++){
                if(bowl[j][0]<bowl[i][0] && bowl[j][1]<bowl[i][1]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        Arrays.sort(dp);
        System.out.println("The maximum number of bowls that can fit inside is "+dp[size-1]);
    }
} 