package com.prepare.puzzle;

abstract class Temp {
	int i=fun();
	
	abstract int fun();
	
	
}
public class Demo2 extends Temp {

	int i=fun();
	
	@Override
	int fun() {
		// TODO Auto-generated method stub
		return 0;
	}

}
