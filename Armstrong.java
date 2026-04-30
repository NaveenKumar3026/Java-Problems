import java.util.*;
import java.lang.Math;

class Armstrong{
	public static int nodigits(int n){
		int digits=0;
		while(n!=0){
			digits+=1;
			n/=10;}
		return digits;}

	public static int checkArmstrong(int a){
		int digits=nodigits(a);
		int sum=0;
		while(a!=0){
			int temp=a%10;
			sum+=Math.pow(temp,digits);
			a/=10;}
		return sum;}			
			
	
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int inp;
		System.out.print("Enter a number:");
		inp=s.nextInt();
		int sum=checkArmstrong(inp);
		if(sum==inp){
			System.out.println("The entered number is an armstrong number.");
		}else{
			System.out.println("The given number is not an armstrong number.");
		}
}}
			