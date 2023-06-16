package TSAME.com;

public class wordcount {

	public static void main(String[] args) {
		
		
		String s="India is my country, We are indians";
		
		int i, c=0;
		
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
				c++;
		}
		
		c++;
		System.out.println("no. of words "+ c);

	}

}
