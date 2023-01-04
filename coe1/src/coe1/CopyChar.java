package coe1;
import java.util.*;
public class CopyChar {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s=sc.nextLine();
		System.out.println("Enter value of n: ");
		int n=sc.nextInt();
		String s1=s.substring(0,2),t="";
		for(int i=0;i<n;i++)
		{
			t=t+s1;
		}
		System.out.println("String after repeating: "+t);

	}

}
