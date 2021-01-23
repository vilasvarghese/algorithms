
class Prob11QuickSortArray 
{ 
    /* This function takes last element as pivot, 
       places the pivot element at its correct 
       position in sorted array, and places all 
       smaller (smaller than pivot) to left of 
       pivot and all greater elements to right 
       of pivot */
    int partition(int arr[], int low, int high) 
    { 
		System.out.println("************** Inside partition ***************");
		System.out.println("Printing input + low "+low +", high " + high);
		printArray(arr);
        int pivot = arr[high];  //{10, 7, 8, 9, 1, 5}, 0, 5
		//first for loop. Moving all element less than pivot to the left.
		//{10, 7, 8, 9, 1, 5}, i = -1, j = 0
		//{10, 7, 8, 9, 1, 5}, i = -1, j = 1
		//{10, 7, 8, 9, 1, 5}, i = -1, j = 2
		//{10, 7, 8, 9, 1, 5}, i = -1, j = 3
		//{1, 7, 8, 9, 10, 5}, i = 0, j = 4
		//first swap. i+1 is the position where the pivot should be.
		//moving pivot after all smaller elements
		//{1, 5, 8, 9, 10, 7}, i = -1, j = 3
		
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than or 
            // equal to pivot 
            if (arr[j] <= pivot) 
            { 
                i++; 
  
                // swap arr[i] and arr[j] 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            }
			printArray(arr);
        } 
		
        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
		System.out.println("Printing output i+1 "+ (i+1));
		printArray(arr);
		System.out.println("************** Exit partition ***************");
        return i+1; 
    } 
  
  
    /* The main function that implements QuickSort() 
      arr[] --> Array to be sorted, 
      low  --> Starting index, 
      high  --> Ending index */
    void sort(int arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = partition(arr, low, high); 
  
            // Recursively sort elements before 
            // partition and after partition 
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    } 
  
    /* A utility function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
  
    // Driver program 
    public static void main(String args[]) 
    { 
        int arr[] = {10, 7, 8, 9, 1, 5}; 
        int n = arr.length; 
  
        Prob11QuickSortArray qs = new Prob11QuickSortArray(); 
        qs.sort(arr, 0, n-1); 
  
        System.out.println("sorted array"); 
        printArray(arr); 
    } 
} 