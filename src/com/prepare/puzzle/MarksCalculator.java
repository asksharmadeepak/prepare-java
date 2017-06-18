package com.prepare.puzzle;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MarksCalculator {

	
		/*
		 * InputStream inputStream
		 * =MarksCalculator.class.getResourceAsStream("/input.txt"); String
		 * str=""; StringBuffer buf = new StringBuffer(); try { BufferedReader
		 * reader = new BufferedReader(new InputStreamReader(inputStream)); if
		 * (inputStream!=null) { while ((str = reader.readLine()) != null) {
		 * buf.append(str + "\n" ); } } } finally { try { is.close(); } catch
		 * (Throwable ignore) {} }
		 */
		/*List<String> inputList = null;
		processData(inputList);*/
		
		
		    static void m(Object o) {
		            System.out.println("m(o)");
		    }
		    static void m(String s) {
		            System.out.println("m(s)");
		    }
		    static void m(Integer i) {
		            System.out.println("m(i)");
		    }
		    static <T> void f(T t) {
		            m(t) ;
		    }

		    public static void main(String[] args) {
		    	 System.out.println("m(1)");
		            f("abc");
		    }
		
	

	public static Map<String, String> processData(List<String> inputList) {
		Map<String, String> map = new HashMap<String, String>();
		Map<Integer, Map<String, String>> countMap = new TreeMap<Integer, Map<String, String>>();
		for (String line : inputList) {
			String[] array = line.split("\\|");
			if (countMap.isEmpty()) {
				map.put(array[1], array[2]);
				countMap.put(Integer.valueOf(array[0]), map);
			} else if (!countMap.containsKey(Integer.valueOf(array[0]))) {
				if (!map.containsKey(array[1])) {
					map.put(array[1], array[2]);
				}
			}
		}
		return map;
	}

}
