package com.prepare.puzzle;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(null, null);
		map.put(null, null);
		map.put(null, null);
		map.put(1, "one");
		//System.out.println(map.get(null));
		
		HashSet set=new HashSet();
		set.add(null);
		set.add(null);
		set.add(null);
		System.out.println(set);
	}
}
