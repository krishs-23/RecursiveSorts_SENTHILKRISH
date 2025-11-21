/**
 * MergeSort.java
 * 
 * Name: Krish Senthil
 * Period: 2
 * Last Revision Date: 11/18/2025
 * Description: This class implements the Merge Sort algorithm for sorting an array of integers
 */

import java.util.Arrays;

public class MergeSort {
	
	/**
	 * Takes an array of integers and sorts it using Merge Sort algorithm recursively
	 * @param nums The array of integers to be sorted
	 */
	public static void sort(int[] nums) {
		
		// Print the current array being sorted
		System.out.println("Sorting array " + Arrays.toString(nums));
		
		// Base case
		// If the array has 0 or 1 element, already sorted
		if (nums.length <= 1) {
			return;
		}
		
		// Split the array into two halves
		int mid = nums.length/2;
		// Create left and right arrays
		int[] left = splitArray(nums, 0, mid);
		// Right array
		int[] right = splitArray(nums, mid, nums.length);
		
		// Recursively sort the left and right arrays
		sort(left);
		sort(right);
		
		// Merge the sorted left and right arrays back into the original array
		System.out.println("Merging arrays " + Arrays.toString(left) + " and " 
														+ Arrays.toString(right));
		
		// Merge left and right into nums
		merge(left, right, nums);
	}
	
	/**
	 * Takes a portion of an array and returns a new array containing that portion
	 * @param nums The original array
	 * @param start The starting index (inclusive)
	 * @param stop The stopping index (exclusive)
	 * @return int[] A new array containing the portion of the original array
	 */
	private static int[] splitArray(int[] nums, int start, int stop) {
		
		// Calculate the length of the new array
		int length = stop - start;
		
		// Handle case where length is negative
		if (length < 0) {
			length = 0;
		}
		
		// Create the new array
		int[] newArray = new int[length];
		
		// Copy the elements from the original array to the new array
		for (int i = 0; i < length; i++) {
			newArray[i] = nums[start + i];
		}
		
		// Return the new array
		return newArray;
	}
	
	/**
	 * Takes two sorted arrays and merges them into the original array in sorted order
	 * @param left The left sorted array
	 * @param right The right sorted array
	 * @param nums The original array to hold the merged output
	 */
	private static void merge(int[] left, int[] right, int[] nums) {
		
		// Indexes for left, right, and original arrays
		int lIndex = 0;
		int rIndex = 0;
		int ogIndex = 0;
		
		// Merge the two arrays
		while (lIndex < left.length && rIndex < right.length) {
			if (left[lIndex] <= right[rIndex]) {
				nums[ogIndex] = left[lIndex];
				lIndex++;
			} else {
				nums[ogIndex] = right[rIndex];
				rIndex++;
			}
			ogIndex++;
		}
		
		// Copy any elements left from left array
		while (lIndex < left.length) {
			nums[ogIndex] = left[lIndex];
			lIndex++;
			ogIndex++;
		}
		
		// Copy any elements left from right array
		while (rIndex < right.length) {
			nums[ogIndex] = right[rIndex];
			rIndex++;
			ogIndex++;
		}
		
	}
	
}
