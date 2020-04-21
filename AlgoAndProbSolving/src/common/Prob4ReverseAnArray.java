package common;

public class Prob4ReverseAnArray {

	public static void main(String args[]) {
		Prob4ReverseAnArray p = new Prob4ReverseAnArray();
		char[] myArray = {'a','b','c','d'};
		System.out.println(p.reverseString(myArray));
		char[] myArray1 = {'a','b','c','d','e'};
		System.out.println(p.reverseString(myArray1));
	}
	
	public char[] reverseString(char[] inputArray) {
		//Add corner case check ect
		double len = inputArray.length;
		int length = (int)Math.ceil(len/2);
		int calLength = (int)len-1;
		char temp;
		for (int i =0; i < length; i++) {
			temp = inputArray[i];
			inputArray[i] = inputArray[calLength -i];
			inputArray[calLength -i] = temp;
		}
		return inputArray;
	}
	//The complexity of this code is O(n/2) - which is generally computed as O(n)
	
}
