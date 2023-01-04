package coe1;

import java.io.*;
public class HelloWorld {
    int age;
    String name;
	public HelloWorld(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("HelloWorld");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n;
		System.out.println("Enter a number:");
		n=Integer.parseInt(br.readLine());
		System.out.println("print number: "+n);
		Boolean b= Boolean.parseBoolean(br.readLine());
		System.out.print(b);
	}

}
