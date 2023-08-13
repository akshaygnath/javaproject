package method;

import java.util.Scanner;

import oops.Accessmodifer;

public class Averagepgm{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter 3 numbers");
		Scanner sc=new Scanner(system.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		Averagepgm ob=new Averagepgm();
		ob.averagepgm (n1,n2,n3);
		Accessmodifer ob1=new Accessmodifer();

	}
	public void average(int n1,int n2,int n3)
	{
		int s=n1+n2+n3;
		int result=s/3;
		System.out.println(result);
	}

}
