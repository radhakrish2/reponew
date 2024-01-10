package com.operator;

import java.util.Scanner;

public class ForDemo {

	public static void main(String[] args) {
		
		System.out.println("main function start");
		int m=4;
		if(m!=4)
		{
		  return;
		}
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		
		for(int i=1;i<=20;i++)
		{
			
			System.out.println(i+"X"+n+"="+i*n);
			
		}
		
	}

}
