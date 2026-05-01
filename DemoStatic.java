import java.util.Scanner;

public class DemoStatic
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
 
		A a1 = new A();
		System.out.print("Enter the value of b: ");
		int value = scan.nextInt();
		a1.setb(value);
		a1.print();
	}
}
 

class A
{
	static int a=10;
	int b ;
	static void staticSeta(int value)
	{
		a= value;
	}
	void setb(int value)
	{
		Scanner scan = new Scanner(System.in);
		b = value;
		System.out.println("Enter the value of a: ");
		value = scan.nextInt();
        staticSeta(value);
    }
	void print()
	{
		System.out.println("The value of a is "+a);
		System.out.println("The value of b is "+b);
	}
}

