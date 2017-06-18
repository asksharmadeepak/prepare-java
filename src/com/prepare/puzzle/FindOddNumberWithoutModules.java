package com.prepare.puzzle;

public class FindOddNumberWithoutModules {

	public static void main(String[] args) {
		isOdd(7);
	}

	private static boolean isOdd(int input) {
		int quotient=input/2;
		if(quotient*2!=input){
			System.out.println("Number is Odd");
			return true;
		}else{
			System.out.println("Number is Even");
			return false;
		}
	}
}

