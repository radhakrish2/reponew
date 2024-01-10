package com.interfaceex;

 interface A {

	 public final int CONSTANT = 10;
	 static int CONSTANT2 = 10;
	 final static int CONSTANT3 = 10;
	 
	void display();
	
	static void display2()
	{
		System.out.println("static method from A");
	}
	
	default void display3()
	{
		System.out.println("default method from A");
	}
}
