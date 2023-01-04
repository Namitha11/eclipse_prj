package coe1;
import java.util.*;
public class WeightString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s=sc.next();
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			
				if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
				{
					if(!(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'))
                  
					sum=sum+(int)s.charAt(i)-(int)'A'+1;
				}
			}
		for(int i=0;i<s.length();i++)
		{
	           if(s.charAt(i)>='a'&&s.charAt(i)<='z'&&!(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'))
				{
					
				sum=sum+(int)s.charAt(i)-(int)'a'+1;
				}
			}
		
		System.out.println("Weight of String: "+sum);
		for(int i=0;i<s.length();i++)
		{
			
				if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
				{
					if(!(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'))
					{
						System.out.println(s.charAt(i));
					}
				}
		}
		

	}

}
