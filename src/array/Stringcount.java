package array;

import java.util.Scanner;

public class Stringcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String sl=sc.nextLine();//HELLO
		
		int c=0;
		for(int i=0;i<s1.length;i++)
		{		
		if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u')
		{
			c++;
		}
		}
		System.out.println("vowel count="+c);
	}
	}

