/**
 * SortTester.java
 * 
 * Name: Krish Senthil
 * Period: 2
 * Last Revision Date: 11/18/2025
 * Description: Test class for my recursive sorting algorithms (merge sort & quick sort)
 */

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class SortTester {
	// Merge Sort Tests
	
	/**
	 * Tests Merge Sort algorithm with a standard unsorted array
	 */
	@Test
	public void testMergeSortStandard() {
		int[] nums = {5, 1, 4, 2};
        int[] expected = {1, 2, 4, 5};
        MergeSort.sort(nums);
        assertArrayEquals(expected, nums);
        System.out.println();
	}
	
	/**
     * Tests Merge Sort algorithm with a reversed array
     */
    @Test
    public void testMergeSortReversed() {
        int[] nums = {4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4};
        MergeSort.sort(nums);
        assertArrayEquals(expected, nums);
        System.out.println();
    }

    /**
	 * Tests Merge Sort algorithm with an already sorted array
	 */
    @Test
    public void testMergeSortAlreadySorted() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {1, 2, 3, 4};
        MergeSort.sort(nums);
        assertArrayEquals(expected, nums);
        System.out.println();
    }
    
    /**
     * Tests Merge Sort algorithm with an empty array
     */
    @Test
    public void testMergeSortEmpty() {
        int[] nums = {};
        int[] expected = {};
        MergeSort.sort(nums);
        assertArrayEquals(expected, nums);
        System.out.println();
    }

    /**
	 * Tests Merge Sort algorithm with an array with just one element
	 */
    @Test
    public void testMergeSortSingle() {
        int[] nums = {7};
        int[] expected = {7};
        MergeSort.sort(nums);
        assertArrayEquals(expected, nums);
        System.out.println();
    }
    
    /**
	 * Tests Merge Sort algorithm with an array containing duplicates
	 */
    @Test
    public void testMergeSortDuplicates() {
        int[] nums = {5, 2, 5, 1};
        int[] expected = {1, 2, 5, 5};
        MergeSort.sort(nums);
        assertArrayEquals(expected, nums);
        System.out.println();
    }
    
    /**
     * Tests Merge Sort algorithm with an array of an odd size
     */
    @Test
    public void testMergeSortOddSizeArray() {
    	int[] nums = {5, 2, 5, 1, 13, 9, 47};
        int[] expected = {1, 2, 5, 5, 9, 13, 47};
        MergeSort.sort(nums);
        assertArrayEquals(expected, nums);
        System.out.println();
    }
    
    // Quick Sort Tests
    
    /**
	 * Tests Quick Sort algorithm with a standard unsorted array
	 */
	@Test
	public void testQuickSortStandard() {
		int[] nums = {5, 1, 4, 2};
        int[] expected = {1, 2, 4, 5};
        QuickSort.sort(nums);
        assertArrayEquals(expected, nums);
        System.out.println();
	}
	
	/**
     * Tests Quick Sort algorithm with a reversed array
     */
    @Test
    public void testQuickSortReversed() {
        int[] nums = {4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4};
        QuickSort.sort(nums);
        assertArrayEquals(expected, nums);
        System.out.println();
    }

    /**
	 * Tests Quick Sort algorithm with an already sorted array
	 */
    @Test
    public void testQuickSortAlreadySorted() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {1, 2, 3, 4};
        QuickSort.sort(nums);
        assertArrayEquals(expected, nums);
        System.out.println();
    }
    
    /**
     * Tests Quick Sort algorithm with an empty array
     */
    @Test
    public void testQuickSortEmpty() {
        int[] nums = {};
        int[] expected = {};
        QuickSort.sort(nums);
        assertArrayEquals(expected, nums);
        System.out.println();
    }

    /**
	 * Tests Quick Sort algorithm with an array with just one element
	 */
    @Test
    public void testQuickSortSingle() {
        int[] nums = {7};
        int[] expected = {7};
        QuickSort.sort(nums);
        assertArrayEquals(expected, nums);
        System.out.println();
    }
    
    /**
	 * Tests Quick Sort algorithm with an array containing duplicates
	 */
    @Test
    public void testQuickSortDuplicates() {
        int[] nums = {5, 2, 5, 1};
        int[] expected = {1, 2, 5, 5};
        QuickSort.sort(nums);
        assertArrayEquals(expected, nums);
        System.out.println();
    }
    
    /**
     * Tests Quick Sort algorithm with an array of an odd size
     */
    @Test
    public void testQuickSortOddSizeArray() {
    	int[] nums = {5, 2, 5, 1, 13, 9, 47};
        int[] expected = {1, 2, 5, 5, 9, 13, 47};
        QuickSort.sort(nums);
        assertArrayEquals(expected, nums);
        System.out.println();
    }
	
}
