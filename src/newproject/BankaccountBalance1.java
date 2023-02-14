package newproject;

import java.util.Scanner;

class BankaccountBalance1 {
	static int currentbalance = 10000;

	public static void main(String args[]) {
		// BankaccountBalance.bank();
		// BankaccountBalance.balancecheck();
		BankaccountBalance1 d = new BankaccountBalance1();
		d.decision();

		// System.out.println("Your account balance is" +d.decision() );
	}

	public void decision() {
		Scanner obj2 = new Scanner(System.in);
		System.out.println("Enter whether to Withdraw or Deposit ");
		String wd = obj2.nextLine();
		// int deposit=obj2.nextInt();
		if (wd.equals("Withdraw")) {
			BankaccountBalance1.draw();
		} else if (wd.equals("Deposit")) {
			BankaccountBalance1.deposit();
		} else {
			System.out.println("Your input is invalid");
		}

	}

	public static void draw() {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Amount to Withdraw ");
		int withdrawal = obj.nextInt();
		if (currentbalance >= withdrawal) {
			System.out.println("You have Withdrawn " + withdrawal);
			currentbalance = currentbalance - withdrawal;
			System.out.println("Balance after withdrawal: " + currentbalance);
		} else {
			System.out.println(" You can not withdraw " + withdrawal);

			System.out.println("Your balance is: " + currentbalance);
		}
		obj.close();
	}

	public static void deposit() {
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter Amount to Withdraw/Deposit ");
		int deposit = obj1.nextInt();
		System.out.println(" Deposited " + deposit);
		currentbalance = currentbalance + deposit;
		System.out.println("Balance after deposit: " + currentbalance);
		obj1.close();
	}

	/*
	 * public static int balancecheck(){ BankaccountBalance1.draw();
	 * BankaccountBalance1.deposit();
	 * 
	 * System.out.println("Balance : "+ currentbalance); return currentbalance;
	 * 
	 * }
	 */

}
