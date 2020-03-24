package com.java.algorithm;

public class Recursion {
	static int count;

	// it's infinite loop. A separate stack frame will be created for each method
	// call until
	// it throws StackOverFlowException
	static void displayInfinite() {
		count++;
		System.out.println(count);
		displayInfinite();

	}

//4 stack frame for displayFinite() method
	static void displayFinite() {
		count++;
		if (count < 5) {
			System.out.println(count);
			displayFinite();
		}

	}

	// n stack frame for this method
	static int factorial(int n) {
		// base case: fact of 0 is 1
		if (n == 0)
			return 1;
		// recursive case: multiply n by n-1 factorial
		//every recursive case must terminate at a base case
		else
			return (n * factorial(n - 1));
	}
	//No extra memory is required. so there is no out of memory error in case of infinite loop
	static int factorialIteration(int n) {
		int result = 1;
			for (int i = 1; i <= n; i++)
				result = result * i;
		return result;
	}

	//binary search: returns index of the value x if it is present, else return -1
	static int binarySearch(int arr[], int startIndex, int endIndex, int searchCriteria ) {
		if (startIndex < endIndex) {
			int midvalue = startIndex+(endIndex-startIndex)/2;
			if (arr[midvalue]==searchCriteria)
				return midvalue;
			if (arr[midvalue]>searchCriteria)
				return binarySearch(arr, startIndex, midvalue, searchCriteria);
			else
			return binarySearch(arr, midvalue+1, endIndex, searchCriteria);
		}
	return -1;	
	}
	
	// One stack frame for main() method
	public static void main(String[] args) {
		// displayInfinite();
		displayFinite();
		System.out.println(factorial(10));
		System.out.println(factorialIteration(5));
		
		int arr[] = {2,5,6,9,1,6};
		System.out.println(binarySearch(arr, 0, arr.length, 6));

	}

}

/* Example Algorithms of Recursion
• Fibonacci Series, Factorial Finding
• Merge Sort(divide and conquer), Quick Sort
• Binary Search
• Tree Traversals and many Tree Problems: InOrder, PreOrder PostOrder
• Graph Traversals: DFS [Depth First Search] and BFS [Breadth First Search]
• Dynamic Programming Examples
• Divide and Conquer Algorithms
• Towers of Hanoi
• Backtracking Algorithms
*/