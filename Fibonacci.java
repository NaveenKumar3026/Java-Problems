import java.util.*;
class Fibonacci{
	public static int fibo(int n){
		if(n==0){
				return 0;}
			else if(n==1){
				return 1;}
			else if(n==2){
				return 2;}
			else{
				return fibo(n-1)+fibo(n-2);}
}
	public static void main(String args[]){
		int stairs;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the no of stairs:");
		stairs=s.nextInt();
		int res=fibo(stairs);
		System.out.println("Total no.of ways:"+res);
}}
		
			
	