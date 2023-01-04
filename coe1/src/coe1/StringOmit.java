package coe1;
import java.util.*;

public class StringOmit {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String: ");
	String s=sc.nextLine();
	int t=s.indexOf(',');
	String ans="";
	if(s.charAt(t-1)==s.charAt(t+1))
	{
		ans=s.substring(0,t)+s.substring(t+2,s.length());
	}
	else
	{
		ans=s.substring(0,t)+s.substring(t+1,s.length());
	}
	System.out.println("The String after omitting same letter(,):"+ans.toLowerCase());
	
	System.out.println("Enter a number: ");
	int num=sc.nextInt(),t1=0;
	while(num>0)
	{
		int i=num%10;
		t1=(t1+i)*10;
		
		num=num/10;
	}
	System.out.println("Reverse number: "+num);
	}

}
