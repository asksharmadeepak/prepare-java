package com.prepare.collections;

public class MyKey {
	
	int key=10;

	@Override
	public int hashCode() {
		return key;
	}

	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyKey other = (MyKey) obj;
		if (key != other.key)
			return false;
		return true;
	}*/

	
}
