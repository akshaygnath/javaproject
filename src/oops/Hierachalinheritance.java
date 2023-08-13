package oops;

class animal1
{
	public void animaldetails()
	{
		System.out.println("animaldetails");
	}
}


class cat extends animal1
{
	public void catdetails()
	{
		System.out.println("catdetails");
	}
}


class tiger extends animal1
{
	public void tigerdetails()
	{
		System.out.println("tigerdetails");
	}
}

public class Hierachalinheritance {

	public static void main(String[] args) {

		cat ob=new cat();
		ob.animaldetails();
		ob.catdetails();
		
		tiger t=new tiger();
		t.animaldetails();
		t.tigerdetails();
	}

}
