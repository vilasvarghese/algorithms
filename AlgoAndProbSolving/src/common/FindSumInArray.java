package common;

import java.util.HashSet;

public class FindSumInArray {

	public void findSumInArray(int[] array, int total) {
		int arrayLength = array.length;
		HashSet<Integer> set = new HashSet<Integer>(arrayLength);
		for (int i =0; i < arrayLength; i++) {
			int diff = total - array[i];
			if (set.contains(diff)) {
				System.out.println(array[i] +" and "+ diff +" add up to "+total);
				return;
			}else {
				set.add(array[i]);
			}
				
		}
		System.out.println("Couldn't find the number");
	}
	
	public static void main(String[] args) {
		FindSumInArray f = new FindSumInArray();
		int[] input = {2, 3, 5, 8, 10};
		
		f.findSumInArray(input, 7);
	}
}
