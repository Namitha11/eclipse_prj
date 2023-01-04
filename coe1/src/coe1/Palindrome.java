package coe1;
import java.util.*;
public class Palindrome {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a String:");
   String s=sc.nextLine();
   StringBuffer sb=new StringBuffer(s);
   if(s.contentEquals(sb.reverse())==true)
	   System.out.println("It is a palindrome");
   else
	   System.out.println("Not a palindrome");
	}

}
