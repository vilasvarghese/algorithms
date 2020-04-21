package common.array;

import java.util.BitSet;
import java.util.stream.IntStream;
//How to find the missing number in given integer array of 1 to 100?
public class Prob8FindMissingNumber {
	public static void main(String args[]) {
		Prob8FindMissingNumber p = new Prob8FindMissingNumber();
		int[] myArray = {1, 2, 3, 5, 6};
		System.out.println(p.findSingleMissingNumber(myArray));
		
		int[] myArray1 = {1, 3, 5, 6, 7, 8, 9, 10};
		int[] outputArray = p.findMultipleMissingNumber(myArray1, 10);
		for (int i : outputArray) {
			System.out.println(i);
		}
	}
	
	//This will work if there is only one number missing.
	public int findSingleMissingNumber(int[] inputArray) {
		int sum = IntStream.of(inputArray).sum();
		/*for (int i : inputArray) {
			sum += i;
		}*/
		int n = inputArray.length + 1;//+1 since one number is missing
		//actual sum if that number also would have been present would be n*(n+1)/2
		int totalSum = n*(n+1)/2;
		int missingNumber = totalSum - sum;
		return missingNumber;
	}
	
	public int[] findMultipleMissingNumber(int[] inputArray, int count) {
		int length = inputArray.length;
		int missingCount = count - length;
		int[] output = new int[missingCount];
		BitSet bitSet = new BitSet(count);
		for (int number : inputArray) {
			bitSet.set(number -1);
		}
		int lastIndex = 0;
		for (int i = 0; i < missingCount; i++) {
			lastIndex = bitSet.nextClearBit(lastIndex);
			output[i] = lastIndex++;
		}
		return output;
	}
	
}
