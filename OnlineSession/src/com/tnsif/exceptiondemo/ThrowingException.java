package com.tnsif.exceptiondemo;



public class ThrowingException {

	
	
	
	static void m1() throws Exception
	{
		//Explicitly throw an exception
		throw new Exception();
	}
	
	
	static void m2() throws Exception
	{
		m1();
	}

	
	
	public static void main(String[] args) throws Exception {
		
		
			m2();
		
		
	}
}
