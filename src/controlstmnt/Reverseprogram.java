package controlstmnt;
import java.util.Scanner;
public class Reverseprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r=0,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
				int n=sc.nextInt();
		while(n!=0)
		{
		rem=n%10;
		r=r*10+rem;
		n=n/10;
    	
		}
		System.out.println("Reverse of the number is: "+r);

	}
}
