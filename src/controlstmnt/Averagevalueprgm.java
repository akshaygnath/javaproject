package controlstmnt;
import java.util.Scanner;
public class Averagevalueprgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
		double sum = 0,avg=0; 
		System.out.println("Enter the number "); 
		for (int i=1; i<=10; i++ ) 
		{ 
		    int n=sc.nextInt(); 
		    sum=sum+n;
		    avg=sum/10; 
		}
		System.out.println("Average is : "+avg);
	}
	}

