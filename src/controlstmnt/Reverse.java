package controlstmnt;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int r; int s=0;
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in); 
		int n=sc.nextInt();
		while(n>0)
		{
			r=n%10; //2  //5  4 3
			s=s*10+r;  //2 2*10+5=25 25*10+4=254 254*10+3= 2543
			n=n/10; //345 34 3 0
		}
			System.out.println(s);
	}

}
