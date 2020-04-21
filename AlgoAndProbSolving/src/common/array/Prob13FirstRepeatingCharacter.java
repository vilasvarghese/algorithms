package common.array;

import java.util.HashSet;

public class Prob13FirstRepeatingCharacter {

	public static void main(String args[]) {
		Prob13FirstRepeatingCharacter p = new Prob13FirstRepeatingCharacter();
		System.out.println(p.firstRepeatingChar("abc123!@#ab"));
	}
	
	public char firstRepeatingChar(String input) {
		HashSet<Character> hSet = new HashSet<Character>();
		char[] chArray = input.toCharArray();
		for (char chr : chArray) {
			//Character c = new Character(chr);//Looks like this conversion is implicitly happening.
			if (hSet.contains(chr)) {
				return chr;
			}else {
				hSet.add(chr);
			}
		}
		
		return '\u0000';
	}
}
