package com.prepare.array;

public class InsertElementAtSpecifiedLocationOfArray {

	public static void main(String[] args) {
		int inputArray[] = {1, 2, 3, 4, 5, 6};
		addElementAtPosition(inputArray,4,100);
	}

	private static void addElementAtPosition(int inputArray[],int inputPosition, int inputElement) {
		int resultArray[] =new int[inputArray.length];
		for (int i = 0; i < inputPosition; i++) {
			resultArray[i]=inputArray[i];
		}
		resultArray[inputPosition]=inputElement;
		for (int i = inputPosition+1; i < inputArray.length; i++) {
			resultArray[i]=inputArray[i-1];
		}
		for (int i = 0; i < resultArray.length; i++) {
			System.err.println(resultArray[i]);
		}
	}
}
