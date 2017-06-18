package com.prepare.collections;

import java.util.HashMap;
import java.util.Map;

public class MyHashMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<MyKey,String> map=new HashMap<MyKey,String>();
		map.put(new MyKey(), "1");
		map.put(new MyKey(), "2");
		System.out.println(map.size());

	}

}
