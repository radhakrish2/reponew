package com.tnsif.collectiondemo;
import java.util.*;

class Mycomparator implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1 - o2;
	}
	
	
}


public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Set<Integer> set = new TreeSet<>(new Mycomparator());
		set.add(10);
		set.add(15);
		set.add(5);
		set.add(1);
		set.add(2);
		set.add(2);
		
		for(Integer n : set)
		{
			System.out.println(n);
		}
	}

}
