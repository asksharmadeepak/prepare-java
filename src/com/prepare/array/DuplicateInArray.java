package com.prepare.array;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInArray {

	public static void main(String[] args) {
		int arrInput[] = {1,2,3,4,5,5,6,7,8,9};
		Set set=new HashSet();
		
		for (int i = 0; i < arrInput.length; i++) {
			boolean success= set.add(arrInput[i]);
			if(success == false){
				System.out.println(arrInput[i]);
				break;
			}
		}	
	}
}
