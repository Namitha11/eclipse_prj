package coe1;
import java.util.*;
public class ElectronicWatch {

	public static void main(String[] args) {
     try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the Seconds input: ");
		 int sec=sc.nextInt();
		 int h=(sec/(60*60))%24;
		 sec=sec%3600;
		int min=sec/60;
		sec=sec%3600;
		int sec2=sec/60;
		 System.out.printf("%d:%0,2d:%0,2d",h,min,sec2);
		 System.out.println();
		 System.out.printf(h+":"+String.format("%02d", min)+":"+String.format("%02d", sec2));
	}

	}

}
