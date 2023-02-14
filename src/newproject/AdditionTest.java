package newproject;

import java.util.Scanner;

public class AdditionTest {
	public static void main(String arg[] ){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first value");		
	int a = sc.nextInt();
	System.out.println("Enter Second value");		
	int b = sc.nextInt();
	int x =a+b;
	System.out.println("Addition Result is " +x);
	
	}
}
