import java.util.*;
class Palindrome{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int num,pali=0;
		System.out.print("Enter a number:");
		num=s.nextInt();
		int temp1=num;
		while(num!=0){
			int temp=num%10;
			pali=(pali*10)+temp;
			num/=10;
		}
		if(pali==temp1)
			System.out.print("The given number is a palindrome");
		else
			System.out.print("The given number is not a palindrome");
		
}
}

		