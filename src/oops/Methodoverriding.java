package oops;

class car
{
	public void accelator()
	{
		System.out.println("accelator");
	}
}
class bmw extends car
{

	@Override
	public void accelator() {
		System.out.println("bmw accelator");
		super.accelator();
	}
	
}



public class Methodoverriding {

	public static void main(String[] args) {

		bmw ob=new bmw();
		ob.accelator();
	}

}
