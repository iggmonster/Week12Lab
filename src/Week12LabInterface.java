/**
 * This must be implemented to complete the Week 12 lab.
 * Course: CS 1131
 */
public interface Week12LabInterface {
	/**
	 * The Two Way Linear Search algorithm searches from the ends to
	 * the middle. It examines every element in the array starting
	 * from the index 0 as well as from the index n-1. If the target
	 * value is found, then its position is returned. If the target
	 * value does not match any element in the array, the value
	 * returned is -1.
	 * @param array  - int array to search
	 * @param target - the value of the element we seek
	 * @return The index of the element, -1 when no match is found.
	 */
	public int twoWayLinearSearch( int [ ] array, int target );

	/**
	 * The Two Way Bubble Sort algorithm compares adjacent elements
	 * starting from both the beginning and the end of the array
	 * simultaneously. If no swaps occur during a single pass
	 * through the array, we can conclude the array is sorted and
	 * return from the method.
	 * NOTE: This algorithm should be implemented as a
	 * non-destructive sort that returns a new, sorted array
	 * without modifying the original array.
	 * @param array - an unsorted int array
	 * @return A new, sorted int array
	 */
	public int [ ] twoWayBubbleSort( int [ ] array );

	/**
	 * Bonus Sort Problem
	 * Implement the sort described in Algorithm 3.
	 * @param array - an unsorted int array
	 */
	public void sort( int [ ] array );

} // END OF INTERFACE
