package mergesort;

import java.util.Arrays;

public class MergeSort {

	public static void merge(int[] arr, int mid, int low, int high) {
		int[] arrBak = new int[high - low + 1];
		int i = low;
		int j = mid + 1;
		int k = 0;
		while (i <= mid && j <= high) {
			if (arr[i] < arr[j]) {
				arrBak[k++] = arr[i++];
			} else {
				arrBak[k++] = arr[j++];
			}
		}
		while(i<=mid){
			arrBak[k++]=arr[i++];
		}
		while(j<=high){
			arrBak[k++]=arr[j++];
		}
		for (int k2 = 0; k2 < arrBak.length; k2++) {
			arr[low+k2]=arrBak[k2];
		}
	}

	public static int[] mergeSort(int[] arr, int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid + 1, high);
			merge(arr, mid, low, high);
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr={5,4,7,6,5,6,7,3,2232,43,5,32,45,32,4332,54,534,2342,35};
		mergeSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
