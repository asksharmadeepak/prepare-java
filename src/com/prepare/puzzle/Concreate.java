package com.prepare.puzzle;

import java.util.HashMap;
import java.util.HashSet;



public class Concreate   {

	

	public static void main(String[] args) {
	
		
		HashMap<String, String> hash=new HashMap<String, String>();
		hash.put(null,"test");
		hash.put(null,"test1");
		
		
		System.out.println(hash.get(null));
		
		HashSet<String> set=new HashSet<String>();
		set.add(null);
		set.add(null);
		set.add(null);
		
		/*for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
			
		}*/
	}

	
}
