package controlstmnt;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=3,b=2; int c=3;
		switch(c)
		{
		case 1:System.out.println("a+b="+(a+b));
		break;
		case 2:System.out.println("a-b="+(a-b));
		case 3:System.out.println("a*b="+(a*b));
		break;
		case 4:System.out.println("a/b="+(a/b));
		break;
		default:System.out.println("invalid choice");
		}
	}

}
