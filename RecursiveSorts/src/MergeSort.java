/**
 * MergeSort.java
 * 
 * Name: Krish Senthil
 * Period: 2
 * Last Revision Date: 11/14/2025
 * Description: 
 */

import java.util.Arrays;

public class MergeSort {
	
	public static void sort(int[] nums) {
		System.out.println("Sorting array " + Arrays.toString(nums));
		
		if (nums.length <= 1) {
			return;
		}
		
		int mid = nums.length/2;
		int[] left = splitArray(nums, 0, mid);
		int[] right = splitArray(nums, mid, nums.length);
		
		sort(left);
		sort(right);
		
		System.out.println("Merging array " + Arrays.toString(left) + " and " + Arrays.toString(right));
		
		merge(left, right, nums);
	}
	
	private static int[] splitArray(int[] nums, int start, int stop) {
		int length = stop - start;
		
		if (length < 0) {
			length = 0;
		}
		
		int[] newArray = new int[length];
		
		for (int i = 0; i < length; i++) {
			newArray[i] = nums[start + i];
		}
			
		return newArray;
	}
	
	private static void merge(int[] left, int[] right, int[] nums) {
		int lIndex = 0;
		int rIndex = 0;
		int ogIndex = 0;
		
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
		
		while (lIndex < left.length) {
			nums[ogIndex] = left[lIndex];
			lIndex++;
			ogIndex++;
		}
		
		while (rIndex < right.length) {
			nums[ogIndex] = right[rIndex];
			rIndex++;
			ogIndex++;
		}
		
	}
	
}
