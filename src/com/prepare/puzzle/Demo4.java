package com.prepare.puzzle;

public class Demo4 {

	public static void main(String[] args) {
		try {
			System.out.println("Inside Try");
			throw new Exception("Exception occured");
		} catch (Exception e) {
			int i=10/0;
			System.out.println("Inside Catch");
			// TODO: handle exception
		}finally{
			System.out.println("Inside Finally");
		}
	}
}
