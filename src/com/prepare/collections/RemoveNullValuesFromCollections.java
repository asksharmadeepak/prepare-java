package com.prepare.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveNullValuesFromCollections {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(null);
		list.add(2);
		
		System.out.println(list);
		
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			if(iterator.next()==null){iterator.remove();}
			
		}

		System.out.println(list);
		
	}
}
