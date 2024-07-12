package com.tnsif.exceptiondemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		
		System.out.println("Program start");
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number");
		a=sc.nextInt();
		b=sc.nextInt();
		
		
		c=a+b;
		System.out.println(a+"+"+b+"="+c);
		
		c=a-b;
		System.out.println(a+"-"+b+"="+c);
		
		
			c=a/b;
			System.out.println(a+"/"+b+"="+c);
		
			System.out.println("Divided by zero not possible");
	
		
		
		c=a*b;
		System.out.println(a+"*"+b+"="+c);
		
		
		
		
		try {
			
			FileReader fr = new FileReader("E:\\myfile.txt");
		}
		catch (FileNotFoundException e) {
		
			System.out.println("File Not Found");
		}
		
		System.out.println("Program end");
		
	}
	
}
