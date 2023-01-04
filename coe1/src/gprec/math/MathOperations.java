package gprec.math;

public class MathOperations {
	public static String isPalindrome(int n)
	{
		int sum=0,t=n;
		while(n>0)
		{
			sum=sum*10+(n%10);
			n=n/10;
		}
		if(t==sum)
		return "yes";
		else
		return"no";
	}
public static int factorial(int n) {
    int m=1;
    for(int i=1;i<=n;i++)
    	m=m*i;
    return m;
}
public static int ReverseOfNum(int n)
{
  int sum=0;
	while(n>0)
	{
		sum=sum*10+(n%10);
		n=n/10;
	}
	return sum;
}
public static double PowerOf(int n,int m)
{
	return Math.pow(n,m);
}
}
