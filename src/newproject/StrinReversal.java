package newproject;

import java.util.Scanner;

public class StrinReversal {
	public static void main(String args[]) {
		/*Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		System.out.println("Please Enter the Details"+s);*/
		Scanner obj = new Scanner(System.in);
		System.out.println("Please Enter your Details : ");
		String s = obj.nextLine();
		String details=s ;
		StringBuilder dtl = new StringBuilder(details);
		dtl.append("          Hi  "+details + "        Thank For Your Responds");
		System.out.println(dtl);
		dtl.reverse();
		System.out.println(dtl);
		//sc.close();
		obj.close();

	}

}
