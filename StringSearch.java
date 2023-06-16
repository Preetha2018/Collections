package TSAME.com;

import java.util.*;

public class StringSearch {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String s1,s2;
		
		System.out.println("Enter a Sentence ");
		
		s1= sc.nextLine();
		
		System.out.println("Enter a word to search from the sentance ");
		
		s2= sc.nextLine();
		
		
		if(s1.contains(s2))
			System.out.println("Searching string found");
		else
			System.out.println("Searching string not found");
		

	}

}
