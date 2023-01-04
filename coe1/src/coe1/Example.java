package coe1;
import java.util.*;
public class Example {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Number of Command Line Argument = "+args.length);
		if(args.length==0)
			System.out.println("No values");
	Scanner sc=new Scanner(System.in);
	@SuppressWarnings("unused")
	String s=sc.next();
for(int i=0;i<args.length;i++)
{
	System.out.print(args[i]);
		}
	}

}
