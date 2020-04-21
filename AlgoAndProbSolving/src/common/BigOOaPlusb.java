package common;


public class BigOOaPlusb {

	public static void main (String args[]) {
	
	}
	
	public void aPlusBComplexFunction(String[] firstArray, String[] secondArray) {
		for (String s : firstArray) {
			System.out.println(s);
		}
		
		for (String s1 : secondArray) {
			System.out.println(s1);
		}
	}
	
	//Complexity of the above code is a + b. i.e. O(a + b) because the size of a and b 
	//However Big O always assumes the size to be very large for both values 
	//so a and b becomes almost the same. and can be summarized as O(n + n)
	//i.e. O(2n) which is equal to O(n)
}
