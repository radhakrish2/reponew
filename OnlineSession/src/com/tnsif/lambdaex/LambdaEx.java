package com.tnsif.lambdaex;



public class LambdaEx {
	
	public static void main(String[] args) {
		
		Shape s = () ->	System.out.println("Drawing a shape");
			

		s.draw();
	}
}
