import java.util.Scanner;

public class Email
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first name: ");
		String fn = scan.nextLine();
		System.out.print("Enter last name: ");
		String sn = scan.nextLine();
		System.out.print("Enter age: ");
		int age = scan.nextInt();
		System.out.print("Enter id: ");
		int empId = scan.nextInt();
		String fp = "";
		for(int i=0;i<3;i++)
		{
			fp+= fn.charAt(i);
		}
		String lp = "";
		int startIndex = sn.length() - 3;
		if(startIndex<0) startIndex=0;
		for(int i=startIndex;i<sn.length();i++)
		{
			lp+=sn.charAt(i);
		}
		System.out.println("Email:" + fp + lp + empId%100 + age);
 	}
}

 
