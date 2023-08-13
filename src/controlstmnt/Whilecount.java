package controlstmnt;

public class Whilecount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n=3456;
		int c=0;
		while(n>0)  //3456>0   345>0 34 3
		{
			n=n/10;  //3456/10=345   345/10=34 34/10 3/10=0
			c++;//1 2 3
		}
		{
			System.out.println("count="+c);

		}
	}

}
