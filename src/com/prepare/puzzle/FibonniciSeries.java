package com.prepare.puzzle;

public class FibonniciSeries {

	public static void main(String[] args) {
		int f1 = 0, f2 = 1, f3 = 1;
		for (int i = 0; i < 10; i++) {
			System.out.println(f1);
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
		}

	}
}
