package com.prepare.puzzle;

import java.util.HashMap;
import java.util.Map;

public class HashMapPlay {

	public static void main(String[] args) {
		Employee emp1=new Employee(101,"Ram");
		Employee emp2=new Employee(102,"Sam");
		Employee emp3=new Employee(103,"Deep");
		
		Map<Employee,String> map=new HashMap<Employee,String>();
		map.put(emp1, "First");
		map.put(emp2, "Second");
		map.put(emp3, "Third");
		
		System.out.println(map.size());
		
		//emp1.setId(201);
		
		emp1.setName("New Name");
		
		//map.put(emp1, "New Id");
		
		map.put(emp1, "New Name");
		
		System.out.println(map.size());
		
	
	}
}
