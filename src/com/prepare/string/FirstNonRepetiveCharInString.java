package com.prepare.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstNonRepetiveCharInString {

	public static void main(String[] args) {
		String str = "hello how are you";
		getFirstNonRepeatativeCharchterInString1(str);
		System.out.println(getFirstNonRepeatativeCharchterInString2(str));

	}

	// First approach o(n2)
	private static void getFirstNonRepeatativeCharchterInString1(String str) {
		Map<Character, Integer> countMap = new LinkedHashMap<Character, Integer>(
				str.length());
		for (char c : str.toCharArray()) {
			countMap.put(c, countMap.containsKey(c) ? countMap.get(c) + 1 : 1);

		}

		for (Entry<Character, Integer> entry : countMap.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
			}
		}
	}

	/*
	 *  * Finds first non repeated character in a String in just one pass. * It
	 * uses two storage to cut down one iteration, standard space vs time *
	 * trade-off.Since we store repeated and non-repeated character separately,
	 * * at the end of iteration, first element from List is our first non *
	 * repeated character from String.
	 */
	private static char getFirstNonRepeatativeCharchterInString2(String str) {
		Set<Character> repeating = new HashSet<Character>();
		List<Character> nonRepeating = new ArrayList<Character>();
		for (int i = 0; i < str.length(); i++) {
			char letter = str.charAt(i);
			if (repeating.contains(letter)) {
				continue;
			}
			if (nonRepeating.contains(letter)) {
				nonRepeating.remove((Character) letter);
				repeating.add(letter);
			} else {
				nonRepeating.add(letter);
			}
		}
		return nonRepeating.get(0);
	}

	/*
	 *  * Using HashMap to find first non-repeated character from String in Java.
	 * * Algorithm : * Step 1 : Scan String and store count of each character in
	 * HashMap * Step 2 : traverse String and get count for each character from
	 * Map. * Since we are going through String from first to last character, *
	 * when count for any character is 1, we break, it's the first * non
	 * repeated character. Here order is achieved by going * through String
	 * again.
	 */

	private static char getFirstNonRepeatativeCharchterInString3(String str) {
		HashMap<Character, Integer> scoreboard = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (scoreboard.containsKey(c)) {
				scoreboard.put(c, scoreboard.get(c) + 1);
			} else {
				scoreboard.put(c, 1);
			}
		}
		// since HashMap doesn't maintain order, going through string again
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (scoreboard.get(c) == 1)
				return c;
		}
		return 'c';
	}
}
