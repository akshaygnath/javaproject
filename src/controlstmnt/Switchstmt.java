package controlstmnt;

public class Switchstmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int day=3;
		
		switch(day)
		{
		case 1:System.out.println("monday");
		break;
		case 2:System.out.println("tuesday");
		break;
		case 3:System.out.println("wednesday");
		
		case 4:System.out.println("thursday");
		
		case 5:System.out.println("friday");
		break;
		case 6:System.out.println("saturday");
		break;
		case 7:System.out.println("monday");
		break;
		default:System.out.println("invalid choice");
		}
	}

}
