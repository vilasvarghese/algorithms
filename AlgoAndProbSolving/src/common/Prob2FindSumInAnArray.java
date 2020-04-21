package common;

import java.util.HashSet;

public class Prob2FindSumInAnArray {

	public static void main(String[] args) {
		Prob2FindSumInAnArray p = new Prob2FindSumInAnArray();
		int[] myArray = {1, 2, 3, 4, 9};
		System.out.println(p.findSum(myArray,  8));
		int[] myArray1 = {1, 2, 3, 4, 4};
		System.out.println(p.findSum(myArray1,  8));
		
	}
	
	public boolean findSum(int[] array, int sum) {
		HashSet<Integer> complimentSet = new HashSet<Integer>();
		
		for (int i : array) {
			int compliment = sum - i;
			if (complimentSet.contains(new Integer(compliment))){
				System.out.println("Found Sum "+ i +" "+ (compliment));
				return true;
			}
			complimentSet.add(new Integer(i));
		}
		
		
		return false;
	}
} 