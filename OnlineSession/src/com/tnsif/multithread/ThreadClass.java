package com.tnsif.multithread;

public class ThreadClass extends Thread{

	private SharedResource sr;

	public ThreadClass(SharedResource sr) {
		
		this.sr = sr;
	}
	
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			sr.increment();
			//System.out.println("Count: "+sr.getCount());
		}
		
	}
	
	
	
	
}
