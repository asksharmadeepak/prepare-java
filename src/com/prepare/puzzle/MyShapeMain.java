package com.prepare.puzzle;

public class MyShapeMain {

	public static void main(String[] args) {
		
		MyShape shape1=new MyShape("shape1");
		MyShape shape2=shape1;
		createShape(shape2);
		System.out.println(shape1.getShape());
	}

	private static void createShape(MyShape shape2) {
		shape2=new MyShape("Its a new Shape");
	}
}
