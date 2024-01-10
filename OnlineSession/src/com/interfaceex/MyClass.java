package com.interfaceex;

public class MyClass implements A , B {

	public void display()
	{
		System.out.println("this is display method");
	}
	
	@Override
	public  void display3()
	{
		System.out.println("default method from MyClass");
	}
}
