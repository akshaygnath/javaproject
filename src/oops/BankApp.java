package oops;

import java.util.Scanner;

interface Bank
{
	public void persondetails(String name);
	public void deposit();
	public void withdrawl();
	public void balance();
}

class Sbi implements Bank
{
	static String bankname="sbi";
	int accountno;
	int balance=10000;
	Scanner sc=new Scanner(System.in);
	@Override
	public void persondetails(String name) {
		System.out.println("enter your accountno:");
		accountno=sc.nextInt();
		System.out.println("bank name="+bankname);
		System.out.println("accountno="+accountno);
		System.out.println("your name is"+name);
		
	}
	@Override
	public void deposit() {
		System.out.println("enter your deposit amount");
		int dep=sc.nextInt();
		balance=balance+dep;
		System.out.println("balance="+balance);
		
		
	}
	@Override
	public void withdrawl() {
		System.out.println("enter your withdrawl amount");
		int amount=sc.nextInt();
		balance=balance-amount;
		System.out.println("balance="+balance);
		
	}
	@Override
	public void balance() {
		System.out.println(balance);
	}
	
}
public class BankApp {

	public static void main(String[] args) {
		
		Sbi ob=new Sbi();
		ob.persondetails("search");
		ob.balance();
		ob.deposit();
		ob.withdrawl();
 
	}

}
