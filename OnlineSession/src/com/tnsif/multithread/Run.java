package com.tnsif.multithread;

public class Run {

	public static void main(String[] args) {
		
		SharedResource sr = new SharedResource();
		ThreadClass t1 = new ThreadClass(sr);
		t1.start();
		ThreadClass t2 = new ThreadClass(sr);
		t2.start();
		
		ThreadClass t3 = new ThreadClass(sr);
		t3.start();
		ThreadClass t4 = new ThreadClass(sr);
		t4.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(sr.getCount());

	}

}
