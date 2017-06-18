package com.prepare.array;

import java.util.HashSet;

public class TwoArrayWhichElementIsNotPresent {

	
	public static void main(String[] args) {
	
		int inputArrayFirst[]= {1,2,3,4,5}; 
		int inputArraySecond[]= {2,3,1,0,5}; 
		
		HashSet set=new HashSet();
		
		for (int i = 0; i < inputArraySecond.length; i++) {
			set.add(inputArraySecond[i]);
		}
		
		for (int i = 0; i < inputArrayFirst.length; i++) {
			
			if(!set.contains(inputArrayFirst[i])){
				System.out.println(inputArrayFirst[i]);
			}
		}
	}
}
