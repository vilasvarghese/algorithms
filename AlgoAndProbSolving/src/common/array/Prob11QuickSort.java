package common.array;

import java.util.Arrays;
import java.util.Stack;

public class Prob11QuickSort {
//Quick sort may not be always the quickest sort method
	//However in a good number of case, the first iteration would sort the list to a great extend.
	//In Quick sort we pick a pivot can be any one integer, loop through all other values to find it's position
	//i.e. finds out all values smaller than that and bigger than that and swaps them.
	//then we break the array into two parts and repeats the same.
	public static void main(String args[]) {
		int[] unsorted = { 34, 32, 43, 12, 11, 32, 22, 21, 32 };
		System.out.println("Unsorted array : " + Arrays.toString(unsorted));
		iterativeQsort(unsorted);
		System.out.println("Sorted array : " + Arrays.toString(unsorted));
	}

	
	
	/* * iterative implementation of quicksort sorting algorithm. */ 
	public static void iterativeQsort(int[] numbers) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(new Integer(0));
		stack.push(new Integer(numbers.length));
		while (!stack.isEmpty()) {
			int end = stack.pop();
			int start = stack.pop();
			if (end - start < 2) {
				continue;
			}
			int p = start + ((end - start) / 2);
			p = partition(numbers, p, start, end);
			stack.push(p + 1);
			stack.push(end);
			stack.push(start);
			stack.push(p);
		}
	}

	/*
	 * * Utility method to partition the array into smaller array, and * comparing
	 * numbers to rearrange them as per quicksort algorithm.
	 */ private static int partition(int[] input, int position, int start, int end) {
		int l = start;
		int h = end - 2;//we will move our pivot to the end
		int piv = input[position];//get the pivot
		swap(input, position, end - 1);//swap pivot to the last element
		while (l < h) {//until low index is less than high index.. we are moving in both direction
			if (input[l] < piv) {//left side value is less than pivot
				l++;
			} else if (input[h] >= piv) {//right side is more than or equal to pivot
				h--;
			} else {
				swap(input, l, h);//if not if we found the right combination to swap
			}
		}
		int idx = h;
		if (input[h] < piv) {
			idx++;
		}
		swap(input, end - 1, idx);
		return idx;
	}

	/**
	 * * Utility method to swap two numbers in given array * * @param arr - array on
	 * which swap will happen * @param i * @param j
	 */
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
}
