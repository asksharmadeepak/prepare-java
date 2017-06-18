package com.prepare.cloning;

public class TestStatic {
	public static void print(){
		System.out.println("Hello Print");
	}
	public static void main(String[] args) {
		TestStatic ts=new TestStatic();
		ts=null;
		ts.print();
	}
}
