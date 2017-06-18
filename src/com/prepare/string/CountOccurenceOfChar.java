package com.prepare.string;

import java.util.HashMap;
import java.util.Map;

public class CountOccurenceOfChar {

	public static void main(String[] args) {
		String input="hello";
		Map<Character, Integer> hashMap=new HashMap<Character, Integer>();
		
		for (int i = 0; i < input.length(); i++) {
		
		char inputChar = input.charAt(i);
		if(hashMap.containsKey(inputChar)){
			hashMap.put(inputChar, hashMap.get(inputChar) + 1);
		}
		else{
			hashMap.put(inputChar, 1);
		}
		
		//h,1
		//e, 1
		//l ,1
		// l, 2
		System.out.println(hashMap);
		}
	}
}
