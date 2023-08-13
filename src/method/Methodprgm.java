package method;

public class Methodprgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Methodprgm ob=new Methodprgm();
		ob.add();
	}
	//1. method without returntype and without parameter
	
	public void add()
	{
		int a=30,b=40;
		int c=a+b;
		System.out.println(c);
	}
//2. method with return type and without parameter
	
	public int sub()
	{
		int a=30,b=20;
		int c=a-b;
		
		return c;
	}
	
	//3.method with returntype and with parameter
	
	public int mul(int a,int b)
	{
		int c=a*b;
		
		return c;
	}
	//4. method without returntype and with parameter
	
	public void div(double a,double b)
	{
		double c=a/b;
		System.out.println(c);
	}
}
