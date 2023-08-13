package oops;

class Emp
{
	private String empname;
	private String empdesignation;
	
	public String getEmpdesignation() {
		return empdesignation;
	}

	public void setEmpdesignation(String empdesignation) {
		this.empdesignation = empdesignation;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpname() {
		return empname;
	}
}
public class Encap {

	public static void main(String[] args) {
		Emp ob=new Emp();
		ob.setEmpname("AKSHAY");
		ob.setEmpdesignation("SOFTWARE TESTER");
		System.out.println(ob.getEmpname());
		System.out.println(ob.getEmpdesignation());

	}

}
