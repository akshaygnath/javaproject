package array;

import java.util.Scanner;

public class Singledimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar=new int[3];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		for(int i=0;i<3;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		//ar[0]=34;
		//ar[1]=44;
		//ar[2]=24;
		
		System.out.println("entered numbers:");
		
		for(int i=0;i<3;i++)
		{
			System.out.println(ar[i]);
		}

	}

}
