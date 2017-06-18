package com.prepare.cloning;

public class Test {

	
       /* ArrayList<ArrayList<Integer>> array = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<10000; i++) {
            try {
                array.add(new ArrayList<Integer>(1000000));
            } catch (OutOfMemoryError e) {
                System.out.println(i);
                break;
            }
        }
        
        
        
*/    
		public static void main(String[] args) {
	        int c = 0;
	        for (String s: args) {
	            Integer i = Integer.parseInt("abc");
	            while (i > 0) {
	                if (i%2 == 1) {
	                    c++;
	                }
	                i >>= 1;
	            }
	        }
	        System.out.println(c);
	    }	
	
	
}
