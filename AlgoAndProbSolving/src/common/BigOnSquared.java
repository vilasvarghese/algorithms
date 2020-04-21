package common;


public class BigOnSquared {

	public static void main (String args[]) {
	
	}
	
	public void nSquaredFunction(String[] firstArray) {
		for (String a : firstArray) {
			System.out.println(a);
		}
		for (String s : firstArray) {
			for (String s1 : firstArray) {
				System.out.println(s + " "+ s1);
			}
		}
	}
	
	//Complexity of above program is O(n + n^2) - Explain how it is n squared
	//For a large n, n becomes negligible in front of n^2. For e.g. if n is 50 lakh, calculate the value.
	//Hence complexity is summarized as O(n^2).
}
