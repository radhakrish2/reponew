package com.tnsif.collectiondemo;

import java.util.*;

public class ListDemo {

	public static void main(String[] args) {
		
		List obj = new ArrayList();
		
		obj.add(100); // Integer
		obj.add(25.5);
		obj.add("TNSIF");
		obj.add('C');
		
		//print using toString
		System.out.println(obj);
		
		//for-each loop
		for(Object o:obj)
		{
			System.out.println(o);
		}
		
		//Iterate using Iterator.
		Iterator it = obj.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//forEach function
		obj.forEach(o->System.out.println(o));
		
		//forEach function
		obj.forEach(System.out::println);
		
		
		
	}
}
