package oops;

import java.util.Scanner;

class Member
{
	String name;
	int age;
	String phnono;
	String address;
	int salary;
	public void printdetails()
	{
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("phno="+phnono);
		System.out.println("address="+address);
		System.out.println("salary="+salary);
	}
}

class Employee1 extends Member
{
	String specilazation;
}
class Manager extends Member
{
	String department;
}
public class Inheritanceprogrm {

	public static void main(String[] args) {
		
		Employee1 emp1=new Employee1();
		emp1.name="akshay";
		emp1.age=22;
		emp1.phnono="7907571656";
		emp1.address="sreedharanivas";
		emp1.salary=10000;
		System.out.println(emp1.specilazation="tester");
		emp1.printdetails();
		
		Manager man1=new Manager();
		man1.name="rajith";
		man1.age=23;
		man1.phnono="8807571656";
		man1.address="arror";
		man1.salary=10000;
		System.out.println(man1.department="develpoer");
		man1.printdetails();

	
	}

}
