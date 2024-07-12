package com.tnsif.collectiondemo;


import java.util.*;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		List<Product> mylist = new LinkedList<>();
		Product p1 = new Product(101, 442, "Keyboard");
		mylist.add(p1);
		mylist.add(new Product(102,700,"Mouse"));
		mylist.add(new Product(103,800,"RAM"));
		mylist.add(new Product(104,3000,"HDD"));
		mylist.add(new Product(105,900,"Pendrive"));
		mylist.add(new Product(106,900,"Apple ipod"));
		Collections.sort(mylist,(o1,o2)->o2.getId()-o1.getId());
				for(Product p : mylist)
		{
			System.out.printf("%-5s%-11s%-15s\n",p.getId(),p.getName(),p.getPrice());
		
		}
	/*	
		List<Integer> mylist = new ArrayList<>();
		mylist.add(100);
		mylist.add(200);
		mylist.add(300);
		mylist.add(450);
		mylist.add(400);
		mylist.add(240);
		
		int index = Collections.binarySearch(mylist, 400);
		
		int max = Collections.max(mylist);
		
		System.out.println("Minum value in this list is: "+max);
		
		System.out.println("400 is found at "+index);
	*/		
	
	}

}
