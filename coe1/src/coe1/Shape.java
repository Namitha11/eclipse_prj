package coe1;

public class Shape {
	void area(double rad)
	{
		System.out.println("Area of circle"+3.14*rad*rad);
	}
	int area(int s)
	{
		return s*s;
	}
	void area(int l,int b)
	{
		System.out.println("Area of rectangle "+l*b);
	}
	double area(double b,double h)
	{
		return 0.5*b*h;
	}
}
