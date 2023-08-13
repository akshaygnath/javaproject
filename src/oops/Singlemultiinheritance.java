package oops;

class animal
{
	public void animalfood()
	{
		System.out.println("animalfood");
	}
}

class dog extends animal
{
	public void breed()
	{
		System.out.println("lab");
	}
}

class babydog extends dog
{
	public void babydogfeature()
	{
		System.out.println("babydog");
	}
	
}
public class Singlemultiinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		dog ob=new dog();
		ob.animalfood();
		ob.breed();
		
		babydog baby=new babydog();
		baby.animalfood();
		baby.breed();
		baby.babydogfeature();
				
	}

}
