package oops;

	abstract class car{
		abstract public void speedlimit();
		public void carengine()
		{
			System.out.println("car engine");
			
		}
	}
	class Maruti extends car
	{
		@override
		public void speedlimit() {
			System.out.println("maruti speedlimit");
		}
	}

	class bmw extends car
	{
		@override
		public void speedlimit() {
			System.out.println("bmw speedlimit");
			}
		}
	public class Abstraction {

		public static void main(String[] args) {
			
			Maruti m=new Maruti();
			m.carengine();
			m.speedlimit();
	}

}
