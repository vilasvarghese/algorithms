package com.forcollege;

public class Anagrams {

	public static boolean isAnagram(String word, String anagram) {
		if (word.length() != anagram.length()) {
			return false;
		}
		char[] chars = word.toCharArray();
		for (char c : chars) {
			//The time complexity of String.indexOf is more than O(c)
			int index = anagram.indexOf(c);
			if (index != -1) {
				//what can we do better here.
				anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
			} else {
				return false;
			}
		}
		return anagram.isEmpty();
	}
	
	
	
	
	
	
	/*
	 * Above method uses String.indexOf which is more than O(n) complex.
	 * Hence this can be solved by using a HashSet.
	 * HashSet would have constant time complexity
	 */
	
	public static void main(String[] args) {
		System.out.println(isAnagram("Mary", "aMry"));
		System.out.println(isAnagram("PMary", "aMry"));
	}
}
