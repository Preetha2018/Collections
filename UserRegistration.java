package TSAME.com;

import java.util.*;

public class UserRegistration {

	public static void main(String[] args) {
		
		String rollno, stuname, mobileno, mailid, qualification;
		
		Scanner key = new Scanner(System.in);
		
		
		System.out.println("Enter your rollno ");
		rollno = key.next();
		System.out.println("Enter Name ");
		stuname = key.next();
		System.out.println("Enter your mobile number ");
		mobileno = key.next();
		System.out.println("Enter your Mailid ");
		mailid = key.next();
		System.out.println("Enter your Qualiifcation ");
		qualification = key.next();
		
		int c=-1;
;
		if(mobileno.length()==10)
		{
			for(int i=0;i<mobileno.length();i++)
			{
				if(mobileno.charAt(i)>='0' &  mobileno.charAt(i)<='9')
					c=0;
				else
				{
					c=1;
					break;
				}
			}
			
		}
		
		if((mailid.contains("gmail.com") || mailid.contains("yahoo.com")) & c==0 )
		System.out.println("Registration completed successfully...");
		else
			System.out.println("Incomplete data/Not registered...");	
		

	}

}
