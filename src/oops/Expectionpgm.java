package oops;

public class Expectionpgm {

	public static void main(String[] args) {
		
		try {
			int a=20,b=0;
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println("airthmetic expection");
		}
		System.out.println("hello");
		
		try {
			int []a=new int[2];
			a[0]=23;
			a[1]=34;
			System.out.println(a[3]);
		}
		catch(Exception e)
		{
			System.out.println("arrayindexoutofboundexpection");
		}
		
		String s=null;
		System.out.println(s.length());
    
	}

}
