package coe1;
import gprec.math.*;
import java.util.*;

public class MathPackTest {

	@SuppressWarnings({ "resource", "static-access" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		MathOperations ob=new MathOperations();
		System.out.println("factorial of a number "+ob.factorial(n));
		System.out.println("Is number Palindrome: "+ob.isPalindrome(n));
		System.out.println("Reverse of a number: "+ob.ReverseOfNum(n));
		if(n==ob.ReverseOfNum(n))
			System.out.println("Yes");
		System.out.println("Enter the power: ");
		int p=sc.nextInt();
		System.out.println("The Power(n,m): "+ob.PowerOf(n, p));

	}

}
