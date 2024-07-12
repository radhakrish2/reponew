package com.tnsif.multithread;

public class SharedResource {
	
	private int count=0;
	
	public synchronized  void increment()
	{
		count++;
	}
	
	public synchronized int getCount()
	{
		return count;
	}
}
