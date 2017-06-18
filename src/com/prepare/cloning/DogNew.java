package com.prepare.cloning;


abstract class Team{
	
	public void temp(){
		
	}
	
	
}

public class DogNew extends Animal{

	protected void name(){
		System.out.println("Dog");
	}
	public static void main(String[] args) {
		
		Animal animal=new DogNew();
		animal.name();
		
	}
}