package test;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the student marks");
		
		System.out.println("mark 1");
		int m1 = s.nextInt();
		 
		System.out.println("mark 2");
		int m2 = s.nextInt();
		      
		System.out.println("mark 3");
		int m3 = s.nextInt();
		         
		       int Total=m1+m2+m3;
		       System.out.println("Total is: "+Total);
			
	float avg = Total/3;
	
	System.out.println("Average is:"+avg);
	}	

}
