package com.interfaceex;

public interface B {

	void display();
	
	static void display2()
	{
		System.out.println("static method from B");
	}
	
	default void display3()
	{
		System.out.println("default method from B");
	}
}
