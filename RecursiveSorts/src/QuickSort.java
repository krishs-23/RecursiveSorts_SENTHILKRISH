/**
 * QuickSort.java
 * 
 * Name: Krish Senthil
 * Period: 2
 * Last Revision Date: 11/19/2025
 * Description: 
 */

import java.util.Arrays;

public class QuickSort {
	public static void sort(int[] nums) {
		sort(nums, 0, nums.length - 1);
	}
	
	private static void sort(int[] nums, int low, int high) {
		System.out.println("Partitioning array " + Arrays.toString(nums) + " from index " + low 
																			+ " to index " + high);
		if (low < high) {
			int partitionInd = partition(nums, low, high);
			
			sort(nums, low, partitionInd - 1);
			sort(nums, partitionInd + 1, high);
		}
	}
	
	private static int partition(int[] nums, int low, int high) {
		int pivot = nums[high];
		int smallInd = low - 1;
		
		for (int j = low; j < high; j++) {
			if (nums[j] <= pivot) {
				smallInd++;
				
				int temp = nums[smallInd];
				nums[smallInd] = nums[j];
				nums[j] = temp;
			}
			System.out.println("Array after iteration " + ((j - low) + 1) + ": " + Arrays.toString(nums));
		}
		
		int temp = nums[smallInd + 1];
		nums[smallInd + 1] = nums[high];
		nums[high] = temp;
		
		System.out.println("Array after partition complete: " + Arrays.toString(nums) 
																+ "\nPivot index: " + (pivot - 1));
		return smallInd + 1;
	}
	
	public static void main(String[] args) {
		int[] test = {1, 5, 4, 2, 3};
		sort(test);
	}
}
