/**
 * QuickSort.java
 * 
 * Name: Krish Senthil
 * Period: 2
 * Last Revision Date: 11/19/2025
 * Description: This class implements the Quick Sort algorithm for sorting an array of integers
 */

import java.util.Arrays;

public class QuickSort {
	
	/**
	 * Takes an array of integers and sorts it using Quick Sort algorithm
	 * @param nums The array of integers to be sorted
	 */
	public static void sort(int[] nums) {
		
		// Print the initial array
		sort(nums, 0, nums.length - 1);
	}
	
	/**
	 * Takes a portion of an array and sorts it using Quick Sort algorithm recursively
	 * @param nums The array of integers to be sorted
	 * @param low The starting index
	 * @param high The ending index
	 */
	private static void sort(int[] nums, int low, int high) {
		
		// Print the current array being partitioned
		System.out.println("Partitioning array " + Arrays.toString(nums) + " from index " + low 
																			+ " to index " + high);
		
		// Base case
		// If the portion has 0 or 1 element, already sorted
		if (low < high) {
			int partitionInd = partition(nums, low, high);
			
			// Recursively sort the left and right portions
			sort(nums, low, partitionInd - 1);
			sort(nums, partitionInd + 1, high);
		}
	}
	
	/**
	 * Takes a portion of an array and partitions it around a pivot
	 * @param nums The array of integers to be partitioned
	 * @param low The starting index
	 * @param high The ending index
	 * @return int The index of the pivot after partitioning
	 */
	private static int partition(int[] nums, int low, int high) {
		
		// Choose the last element as the pivot
		int pivot = nums[high];
		// Index of smaller element
		int smallInd = low - 1;
		
		// Iterate through array and rearrange elements
		for (int j = low; j < high; j++) {
			if (nums[j] <= pivot) {
				// Increase smaller element index
				smallInd++;
				
				// Swap logic
				int temp = nums[smallInd];
				nums[smallInd] = nums[j];
				nums[j] = temp;
			}
			// Print the array after each time
			System.out.println("Array after iteration " + ((j - low) + 1) + ": " 
															+ Arrays.toString(nums));
		}
		
		// Swap the pivot element with the element at smallInd + 1
		int temp = nums[smallInd + 1];
		// Place pivot in correct position
		nums[smallInd + 1] = nums[high];
		// Place the element at smallInd + 1 to the end
		nums[high] = temp;
		
		// Print the array after partition is complete
		System.out.println("Array after partition complete: " + Arrays.toString(nums) 
															+ "\nPivot index: " + (smallInd + 1));
		// Return the index of the pivot
		return smallInd + 1;
	}
	
}
