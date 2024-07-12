package com.tnsif.exceptiondemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {

	public static void readFile() {
		try(FileReader fr = new FileReader("E://myinput.txt"); BufferedReader br=new BufferedReader(fr)) {
			
			int ch=' ';
			
			
			while((ch=br.read())!=-1)
			{
				System.out.print((char)ch);
			}

		
			
			
		}
		catch (RuntimeException e)
		{
			System.err.println("File Not Exits");
		} 
	

		
	}

	public static void main(String[] arg) throws FileNotFoundException {

		//readFile();
		System.out.println(Double.compare(12, 130)) ;
	}

}
