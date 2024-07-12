package com.tnsif.multithread;

public class MyThread extends Thread {

	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			try
			{
				Thread.sleep(500);
			}
			catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] arg)
	{
		MyThread t1 = new MyThread();
		t1.start();
		
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Welcome");
			
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		
		
	}
	
}
