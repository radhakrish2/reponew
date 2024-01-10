package com.operator;

public class Run {

	public static void main(String[] args) {
		
		int mark=50;
		
		if(mark>=35)
		{
			System.out.println("Pass");
			
			if(mark>=80 && mark<=100)
			{
				System.out.println("A");
			}
			else if(mark>=60 && mark<80)
			{
				System.out.println("B");
			}
			else
			{
				System.out.println("C");
			}
			
		}
		else
		{
			System.out.println("Fail");
		}
			
	}
	


}
