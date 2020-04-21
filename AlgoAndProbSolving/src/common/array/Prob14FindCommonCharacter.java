package common.array;

import java.util.HashSet;
//Find first common character between two arrays
public class Prob14FindCommonCharacter {
	public static void main(String args[]) {
		Prob14FindCommonCharacter p = new Prob14FindCommonCharacter();
		System.out.println(p.findCommonCharacter(new char[]{'a','b','c'}, new char[]{'w','x','y','z','a'}));
	}
	
	public char findCommonCharacter(char[] chr1Array, char[] chr2Array) {
		int len1 = chr1Array.length;
		int len2 = chr2Array.length;
		int len = len1 > len2? len1 : len2;
		HashSet<Character> hSet1 = new HashSet<Character>();
		HashSet<Character> hSet2 = new HashSet<Character>();
		
		
		for (int i =0; i < len; i++) {
			if (i < len1) {
				if (hSet2.contains(chr1Array[i])) {
					return chr1Array[i];
				}else {
					hSet1.add(chr1Array[i]);
				}
			}
			
			if (i < len2) {
				if (hSet1.contains(chr2Array[i])) {
					return chr2Array[i];
				}else {
					hSet1.add(chr2Array[i]);
				}
			}
		}
		return '\u0000';
	}
}