package newproject;

/*public class print {
	int m=10;
	int n= 3;
	static int y= 100; 
			
	public static void main(String args[]) {
		int a= 10;
		String x= "Shabana";
		System.out.println(" " + x +" "+a);	
		print obj1= new print();
		obj1.call();
	}	
		public  void call() {
			//print obj= new print();
			//int b= obj.m;
			System.out.println(" " + m +" "+n);
			System.out.println(" " +y);

		}
	}*/
import java.util.Scanner;

public class print {

	String x ;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String value  ");
		String x = sc.nextLine();
		//n = x;
		print obj1 = new print();
		obj1.get_string(x);
		obj1.print_string();
	}
	public void get_string(String x) {
		this.x=x;
		//this.print_string();
	}

	public String print_string() {
		System.out.println(" The String value is   " + x);
		return x;
	}
}
