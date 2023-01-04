package coe1;
import java.util.*;
public class Myname {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1="CSE";
		String s2="CSE";
		String s3=new String("CSE").intern();
		String s4=new String("CSE");
		System.out.println(s1+" "+s2+" "+s3+" "+s4);
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s2.equals(s3));
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(s1==s3);
		System.out.println(s1.contentEquals(s4));
	     s4=s4.intern();
	     System.out.println(s3==s4);
		String s5=new  String("cse").intern();
		System.out.println(s1.equalsIgnoreCase(s5)+"  "+s1.equals(s5));
		System.out.println("Length of s1: "+s1.length());
		System.out.println("Chracter at index 1: "+s1.charAt(1));
		String s6="GPREC";
		System.out.println("Substring :"+s1.substring(1,2));
		System.out.println("Subsring of gprec : "+s6.substring(3)+" "+s6.substring(0,2));
		System.out.println("Concatination: "+s1.concat(s4)+" "+s1+s4);
		StringBuffer sb=new StringBuffer("ESC");
		sb=sb.reverse();
		System.out.println(s1.contentEquals(sb));
		
	}

}
