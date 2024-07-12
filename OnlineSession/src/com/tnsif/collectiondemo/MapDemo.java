package com.tnsif.collectiondemo;

import java.util.*;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> map = new HashMap();
	    map.put(101, "Kalam");
	    map.put(102, "Ajay");
	    map.put(103, "Sachin");
	    map.put(104, "Priyanka");
	    map.put(105, "Keerthana");
	    
	    System.out.println(map);
	    
	    //ForEnhanced Loop
	    for(Entry<Integer, String> entry : map.entrySet())
	    {
	    	//System.out.println(entry.getValue());
	    	//System.out.println(entry.getKey());
	    	
	    	System.out.println(entry.getKey() +":"+entry.getValue());
	    }
	 
	    
	    //by using forEach Function
	    map.forEach((id,name)->System.out.println(id +":"+name));

	}

}
