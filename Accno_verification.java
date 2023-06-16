package TSAME.com;

import java.util.Scanner;

public class Accno_verification {

	public static void main(String[] args) {
		String name, acno;
		
		Scanner key = new Scanner(System.in);
		
		
		System.out.println("Enter your Name ");
		name = key.next();
		System.out.println("Enter Accountno ");
		acno = key.next();
		
		
		int c=-1;
		
				if(acno.length()==11)
				{
					for(int i=0;i<acno.length();i++)
					{
						if(acno.charAt(i)>='0' &  acno.charAt(i)<='9')
							c=0;
						else
						{
							c=1;
							break;
						}
					}
					
				}
				
				if (c!=0)
					System.out.println("Enter only 11 digits account number");
				else
					System.out.println("Input accepted...");
				

	}

}
