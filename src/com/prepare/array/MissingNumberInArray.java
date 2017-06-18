package com.prepare.array;

//In an array 1-100 numbers are stored, one number is missing how do you find it?

public class MissingNumberInArray {
	public static void main(String[] args) {
		int inputArr[]={1,2,3,4,5,6,8,9,10};
		int count=1;
		for (int i = 0; i <inputArr.length-1; i++) {
			if(count!=inputArr[i]){
		     System.out.println("Missing Number " + count);
		     break;
			}
			count++;
		}
	}
}
