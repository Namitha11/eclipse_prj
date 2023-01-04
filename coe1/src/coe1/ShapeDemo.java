package coe1;

public class ShapeDemo {

	public static void main(String[] args) {
		Shape s=new Shape();
		s.area(10, 20);
		s.area(5.14);
		System.out.println("Area of square:"+s.area(10));
		System.out.println("Area of Triangle: "+s.area(1.4,2.3));

	}

}
