package TSAME.com;

public class StringMethods {

	public static void main(String[] args) {
		
		String str = new String("Java 20.0 is a widely-used is programming is");
		
		
		System.out.println(str.contains("Java"));
		
		System.out.println(str.length());
		
		System.out.println(str.substring(0,8));
		
		System.out.println(str.toUpperCase());
	
		String una="user1", pwd="welcome";
		
		
		if(una.equals("user1") & pwd.equals("welcome@123"))
			System.out.println("Successfully loged in");
		else
			System.out.println("Invalid username or password");
		
		String s= str.replaceAll("is", "are");
		
		
		
		System.out.println(s);
		
		
	

	}

}
