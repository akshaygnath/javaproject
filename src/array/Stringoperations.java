package array;

public class Stringoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//1.concatenation
		
	String s="hey";
	String s1="    welcome";
	String s2="Hello how are you";
	
	System.out.println(s.concat(s1));//hellowelcome
	System.out.println(s+s1);
			System.out.println(1+2+s+4+5);//3hello45
			
//2.equals
		
			System.out.println(s.equals(s1));//false
			System.out.println(s.equals(s2));//false
			System.out.println(s.equalsIgnoreCase(s2));//true
			
//3.contains
			System.out.println(s2.contains("how"));//true
			
//4.touppercase & tolowercase
			
			System.out.println(s.toUpperCase());//false
			System.out.println(s.toLowerCase());//false
			
//5.trim
			
			System.out.println(s1.trim());
			
//6.length
			System.out.println(s.length());
			
//7.startswith
			
			System.out.println(s2.startsWith("Hello"));
			
//8.endswith
			
			System.out.println(s2.endsWith("you"));
			
//9.substring
			
			System.out.println(s2.substring(2,8));
			
//10.charAt()
			
			System.out.println(s.charAt(1));
			
//11.split
			
			String[] sr=s2.split(" ");
		for(String v:sr)
		{
			System.out.println(v);
		}
			
			
			
			
			
	}
}
