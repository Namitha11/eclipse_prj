package coe1;
import java.util.Scanner;

public class MostFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int n1=sc.nextInt(),n2=sc.nextInt(),n3=sc.nextInt();
		String s=Integer.toString(n1)+Integer.toString(n2)+Integer.toString(n3);
		int mc=0;
		char ele=0;
		for(int i=0;i<s.length();i++)
		{
			int c=0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
					c++;
			}
			if(c>=mc&&s.charAt(i)>ele)
			{
				mc=c;
				ele=s.charAt(i);
			}
		}
		int e=Integer.parseInt(String.valueOf(ele));  
		System.out.println(e);
				
	}

}
