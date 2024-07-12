package stringdemo;

import java.util.Scanner;

public class StringFunction {

	public static void main(String[] args) {
		
//		String s="TNSIF : TNSIF";
//		
//		System.out.println(s.charAt(1)); // N
//		System.out.println(s.length()); // 5
//		System.out.println(s.substring(2)); // SIF
//		
//		System.out.println(s.substring(0,4)); // TNSI
//
//		System.out.println(s.indexOf('N')); //1
//		
//		System.out.println(s.lastIndexOf('N'));
//		
//		System.out.println(s.indexOf('Z'));
//		
//		//s= s.toLowerCase();
//		//System.out.println(s);
//		
//		s="Welcome to String Object";	
//		
//		String[] sArray = s.split("\\s");
//		
//		for(String s2 : sArray)
//		{
//			System.out.println(s2);
//		}
//		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter two words");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		
		
		
	}

}
