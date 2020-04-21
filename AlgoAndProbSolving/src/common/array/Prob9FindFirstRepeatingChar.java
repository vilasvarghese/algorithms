package common.array;

public class Prob9FindFirstRepeatingChar {
//Refer Prob13 for solving this using HashMap. That solution would work for any character.
	
	public static void main(String[] args) {
		Prob9FindFirstRepeatingChar p = new Prob9FindFirstRepeatingChar();
		char[] chrArray = {'a', 'B','z', 'Z'};
		System.out.println(p.firstRepeatingChar(chrArray));
	}
	
	public char firstRepeatingChar(char[] chrArray) {
		int[] charArray = new int[26];
		for (char c : chrArray) {
			int intC = (int)c;
			System.out.println("intC "+intC);
			if (intC < 65 || intC >122) {
				System.out.println("Array Contains non-alphabets");
				return '\n';
			}
			if (intC > 90 && intC < 97){
				System.out.println("Array Contains non-alphabets");
				return '\n';
			}
			if (intC < 97) {
				if (charArray[intC-65] ==0) {
					//char coming first time
					charArray[intC-65]++;
				}else {
					//char repeating
					return c;
				}
			}else {
				if (charArray[intC-97] ==0) {
					charArray[intC-97]++;
				}else {
					//char repeating
					return c;
				}
			}
		}
		return 'a';
	}
}