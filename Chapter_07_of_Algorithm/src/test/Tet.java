package test;

import java.util.Arrays;

import quicksort.QuickSort;

public class Tet {

	static QuickSort qs=new QuickSort();
	public static void main(String[] args) {
		int[] arr={13,4,55,6,3,324,54,2,32,45,3};
		qs.quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
