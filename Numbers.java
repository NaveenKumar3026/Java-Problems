import java.util.Scanner;

public class Numbers{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the max number: ");
        int n = scan.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}