package com.prepare.puzzle;

public class TryCatch {

	public static void main(String[] args) {
		System.out.println(cheackReturnValue());
	}

	private static int cheackReturnValue() {
		try {
			System.out.println("try");
			throw new Exception("Throw");
		} catch (Exception e) {
			System.out.println("catch");
			return 1;
		}finally{
			System.out.println("finally");
			return 2;
			
		}
	}
}
