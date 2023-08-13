package array;

import java.util.Scanner;

public class Arraynames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
         String[] ar=new String[5];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter names");
		for(int i=0;i<5;i++)
	
		{
			ar[i]=sc.next();
		}
		
		System.out.println("entered names");
		//for(int i=0;i<5;i++)
		//{
		//	System.out.println(ar[i]);
		//}
		

		for(String v:ar)
		{
			System.out.println(v);
		}
	}

}
