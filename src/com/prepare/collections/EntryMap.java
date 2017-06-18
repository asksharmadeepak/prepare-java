package com.prepare.collections;

public class EntryMap<K,V> {

	private final K key;
	private V value;
	
	public EntryMap(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	
}
