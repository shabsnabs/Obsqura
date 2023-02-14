package newproject;

public class AdditionInstance {
	int a;
	int b;
	
	
	AdditionInstance(int a,int b){
		this.a=a;
		this.b=b;	
	}
	public static void main(String args[]) {

		AdditionInstance obj = new AdditionInstance(10,20);
		//obj.get_result(10, 20);
		System.out.println("Result is   " +obj.get_result());
	}

	public int get_result() {

		int c =a+b;
		System.out.println("Result is   " + c);
		return c;

	}
}
