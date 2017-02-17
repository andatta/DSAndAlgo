package com.anutosh.crack;

import java.util.HashMap;
import java.util.Map;

public class Anagrams {

	public static void main(String[] args) {
		String s1 = "cde";
		String s2 = "abc";

		Map<Character, Integer> characterMap = new HashMap<>();

		// create character map

		char[] char_arr = s1.toCharArray();
		for (char c : char_arr) {
			if (characterMap.containsKey(c)) {
				int count = characterMap.get(c);
				characterMap.put(c, count + 1);
			} else {
				characterMap.put(c, 1);
			}
		}

		int deletions = 0;

		char[] second_char_arr = s2.toCharArray();
		for (char c : second_char_arr) {
			if (characterMap.containsKey(c)) {
				int count = characterMap.get(c);
				if (count > 0) {
					characterMap.put(c, count - 1);
				} else {
					deletions++;
				}
			} else {
				deletions++;
			}
		}
		
		for(Character c : characterMap.keySet()){
			deletions = deletions + characterMap.get(c);
		}

		System.out.print(deletions);

	}

}
