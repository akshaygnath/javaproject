package controlstmnt;

import java.util.Scanner;

public class Calculatorogm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter 2 numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("enter your choice 1.add 2.sub 3.mul 4.div");
		int ch=sc.nextInt();
		double result=0;
		switch(ch)
		{
		case 1:result=a+b;
		
		  break;
		case 2:result=a-b;
		
		   break;
		case 3:result=a*b;
		 break ;
		 case 4:if(b==0)
		 {
			 System.out.println("erro");
		 }
		 else {
			 result=a/b;
		  break;
		 }
		default:System.out.println("invalid choice");
		}
		System.out.println("result="+result);
	}
}

