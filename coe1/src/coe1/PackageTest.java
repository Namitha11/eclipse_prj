package coe1;
import gprec.math.*;
import java.util.*;
public class PackageTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Arithmetic ob=new Arithmetic();
		System.out.println("Enter the two numbers: ");
		int n=sc.nextInt(),m=sc.nextInt();
		System.out.println("Addition of two numbers:"+ob.sum(n,m));
       System.out.println("Subtraction of two  numbers: "+ob.sub(n, m));
       System.out.println("Multiplication of two numbers: "+ob.mul(n, m));
       System.out.println("Division of two numbers: "+ob.div(n, m));
	}

}
