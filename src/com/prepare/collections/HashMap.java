package com.prepare.collections;

import java.util.Arrays;

public class HashMap<K, V> {

	private int size;
	private final static int DEAFULT_CAPACITY = 16;

	EntryMap<K, V>[] values = new EntryMap[DEAFULT_CAPACITY];

	public void put(K key, V value) {
		boolean insert = true;
		for (int i = 0; i < size; i++) {
			if (values[i].getKey().equals(key)) {
				values[i].setValue(value);
				insert = false;
			}
		}
		if (insert) {
			ensureCapacity();
			values[size++] = new EntryMap<K, V>(key, value);
		}

	}// End Of Put

	private void ensureCapacity() {
		if (size == values.length) {
			int newSize = values.length * 2;
			values = Arrays.copyOf(values, newSize);
		}
	}// end of ensure Capacity

	public V get(K key) {
		for (int i = 0; i < size; i++) {
			if (values[i] != null) {
				if(values[i].getKey().equals(key)){
					return values[i].getValue();
				}	
			}
		}
		return null;
	}// End of get

	public void remove(K key){
		for (int i = 0; i < size; i++) {
			if(values[i].getKey().equals(key)){
				values[i]=null;
				size--;
				condenceArray(i);
			}
		}
	}

	private void condenceArray(int start) {
		for (int i = 0; i < size; i++) {
			values[i]=values[i+1];
		}
	}
	

}
