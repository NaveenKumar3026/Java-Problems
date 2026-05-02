import java.util.Scanner;

public class GreatOrSmall{
 public static void main(String[] args){
  System.out.println("Enter the four digit integer ");
  Scanner scan=new Scanner(System.in);
  int[] numbers=new int[4];
 for(int i=0;i<numbers.length;i++)
  {
    numbers[i]=scan.nextInt();
  }
for(int i=0;i<numbers.length-1;i++)
 {
   for(int j=0;j<numbers.length-1-i;j++)
    {
        if(numbers[j]>numbers[j+1])
          {
             int temp=numbers[j];
             numbers[j]=numbers[j+1];
             numbers[j+1]=temp;
          }
     }
  }
 System.out.print("\nSmallest number of the four digit is ");
 for(int num:numbers)
   System.out.print(num);
 System.out.print("\nLargest number of the four digit is ");
 for(int i=numbers.length-1;i>=0;i--){
  System.out.print(numbers[i]);}
}
}