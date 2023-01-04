package coe1;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {

		@SuppressWarnings("resource")
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int a[];
			a=new int[5];
			Scanner sc=new Scanner(System.in);
			for(int i=0;i<5;i++)
				a[i]=sc.nextInt();
			System.out.println("Array elements are: ");
			for(int i=0;i<a.length;i++)
				System.out.println(a[i]);
			Arrays.sort(a);
		System.out.println("max"+a[0]);
		System.out.println("min"+a[4]);
		int n=sc.nextInt(),d=0;
		for(int i=0;i<4;i++)
		{
			if(a[i]==n)
				System.out.println(i);
			else
				d=1;
		
		}
		if(d==1)
			System.out.println("-1");

	}

}
