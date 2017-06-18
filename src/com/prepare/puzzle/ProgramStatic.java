package com.prepare.puzzle;

public class ProgramStatic {
	
	static int i=10;
	{
		i=20;
		
	}
	
	public static void main(String[] args) {
		
		ProgramStatic programStatic=new ProgramStatic();
		programStatic.i=30;
		System.out.println(programStatic.i);
		}
}
