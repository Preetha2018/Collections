package TSAME.com;


import java.util.*;
public class Login {

	public static void main(String[] args) {
		
		
		
		String uid, pwd;
		
		String uname= "user1";
		String pword= "welcome@123";
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter username ");
		uid = key.next();
		
		System.out.println("Enter Password ");
		pwd = key.next();
		
		//compare without checking uppercase/lowercase
		if(uid.equalsIgnoreCase(uname) & pwd.equalsIgnoreCase(pword))
			System.out.println("valid username and password");
		else
			System.out.println("Invalid username and password!!!");
		
		//compare exactly
		if(uid.equals(uname) & pwd.equals(pword))
			System.out.println("valid username and password");
		else
			System.out.println("Invalid username and password!!!");
	

	}

}
