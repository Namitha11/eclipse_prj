package coe1;
import java.util.*;
public class Unique {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int a[]=new int[5],i=0;
		while(n>0)
		{
			a[i]=n%10;
			i=i+1;
			n=n/10;
			
		}
       HashSet<Integer> hs=new HashSet<Integer>();
       for(int in=0;in<5;in++)
       {
    	   hs.add(a[in]);
       }
      System.out.println(hs);
	}

}
