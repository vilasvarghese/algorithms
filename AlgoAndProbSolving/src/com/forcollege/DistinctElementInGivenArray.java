package com.forcollege;

import java.io.*;
import java.util.Scanner;
import java.util.*;

public class DistinctElementInGivenArray {

	static void distinct(int arr[]) {
		System.out.println("");
		System.out.println("Distinct Elements: ");
		int j;
		int num = arr.length;
		for (int i = 0; i < num; i++) {
			for (j = 0; j < i; j++)
				if (arr[i] == arr[j])
					break;
			if (i == j)
				System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter the number of elements in the array:");
		num = sc.nextInt();
		int arr[] = new int[num];
		System.out.println("Enter the elements:");
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Input Array: ");
*/
		int[] arr = {1, 2, 3, 4, 5, 1};
		distinct(arr);
	}
}
