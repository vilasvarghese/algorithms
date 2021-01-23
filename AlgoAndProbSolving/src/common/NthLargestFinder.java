package common;

import java.util.Arrays;
import java.util.LinkedList;

public class NthLargestFinder {

	public static void main(String[] args) {
		
		int[] iArray = {1,6,4,3,7,8};
		NthLargestFinder f = new NthLargestFinder();
		f.findNthLargest(iArray, 5);
	}
	
	public int findNthLargest(int[] intArray, int n) {
		LinkedList<Integer> list = new LinkedList();
		//list.addAll(Arrays.asList(intArray));
		for (int i : intArray) {
			list.add(i);
		}
		System.out.println(list.get(n));
		return list.get(n);
	}
	//Can we use SortedSet and do it better?
}
