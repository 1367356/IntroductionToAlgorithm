package quicksort;

import java.util.Arrays;

public class QuickSortTest {

	public static int partition(int[] arr,int low,int high){
		int basicValue=arr[high];
		int i=low-1;
		for (int j = low; j < high-1; j++) {
			if(arr[j]<basicValue ){  //多了一个小于基准值的数
				i=i+1;               //i加1，因为i的最大角标就是小于基准值的角标
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=arr[i+1];
		return i+1;
	}
	public static int partition2(int[] arr,int low,int high){
		int basicValue=arr[low];
		while(low<high){
			while(arr[high]>=basicValue && low<high){
				high--;
			}
			arr[low]=arr[high];
			while(arr[low]<=basicValue && low<high){
				low++;
			}
			arr[high]=arr[low];
			
		}
		arr[high]=basicValue;
		return high;
	}
	public static void quickSort(int[] arr,int low,int high){
		if(high>low){
			int index=partition2(arr, low, high);
			quickSort(arr, low, index-1);
			quickSort(arr, index+1, high);
		}
	}
	public static void main(String[] args) {
		int[] arr={3,4,5,7,8,34,23,2,3,4,6,7,2,89,4};
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
