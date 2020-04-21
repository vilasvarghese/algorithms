package common;

import java.util.ArrayList;
import java.util.Arrays;


public class DifferenceOfTranspose {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList l1 = new ArrayList();
		l1.addAll(Arrays.asList(4,2,3));
		ArrayList l2 = new ArrayList();
		l2.addAll(Arrays.asList(4,5,6));
		ArrayList l3 = new ArrayList();
		l3.addAll(Arrays.asList(7,8,9));
		ArrayList<ArrayList<Integer>> mat = new ArrayList<ArrayList<Integer>>();
		mat.add(l1);
		mat.add(l2);
		mat.add(l3);
		System.out.println(differenceOfDiaElem(mat));
	}
	
	//this method will return the absolute difference between sum
	//of diagonal elements
	public static int differenceOfDiaElem(ArrayList<ArrayList<Integer>> matrix) {
		int sum1 = 0;
		int sum2 = 0;
		int length = matrix.size();
		int j = length-1;
		for (int i =0; i <= length; i++) {
			sum1 += matrix.get(i).get(i);
			sum2 += matrix.get(j--).get(i);
		}
		
		return Math.abs(sum1 - sum2);
	}
}
