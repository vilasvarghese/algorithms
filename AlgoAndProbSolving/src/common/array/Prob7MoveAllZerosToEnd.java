package common.array;

public class Prob7MoveAllZerosToEnd {
	
	public static void main(String[] args) {
		Prob7MoveAllZerosToEnd p = new Prob7MoveAllZerosToEnd();
		int[] myArray = {0, 1, 5, 0, 3, 0, 9, 8, 7, 5, 2, 1, 0, 3, 0, 8, 0, 0, 9, 7};
		p.moveZerosToEnd(myArray);
		for (int i : myArray) {
			System.out.print(i);
		}
		int[] myArray1 = {0, 1, 5, 0, 3, 0, 9, 8, 7, 5, 2, 1, 0, 3, 0, 8, 0, 0, 9, 7};
		System.out.println("\n");
		pushZerosToEnd(myArray1);
		for (int i : myArray1) {
			System.out.print(i);
		}

	}
	
	public void moveZerosToEnd(int[] inputArray) {
		int numberOfZeros = 0;
		int length = inputArray.length;
		for (int i =0; i < length; i++) {
			if (inputArray[i] == 0) {
				numberOfZeros++;
			}
			else{
				inputArray[i-numberOfZeros] = inputArray[i];
			}
		}
		for (int i = (length - numberOfZeros); i < length; i++) {
			inputArray[i] = 0;
		}
	}
	
	//neater approach
	public static void pushZerosToEnd(int arr[]) 
    { 
        int count = 0;  // Count of non-zero elements 
        int n = arr.length;
        // Traverse the array. If element encountered is 
        // non-zero, then replace the element at index 'count' 
        // with this element 
        for (int i = 0; i < n; i++) 
            if (arr[i] != 0) 
                arr[count++] = arr[i]; // here count is 
                                       // incremented 
  
        // Now all non-zero elements have been shifted to 
        // front and 'count' is set as index of first 0. 
        // Make all elements 0 from count to end. 
        while (count < n) 
            arr[count++] = 0; 
    } 
}