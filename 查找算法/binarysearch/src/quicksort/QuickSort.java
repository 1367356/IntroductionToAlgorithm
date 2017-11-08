package quicksort;

import java.util.Arrays;

public class QuickSort {
	
	public static int partition1(int[] arr,int low,int high){
		//切分
		int key=arr[low];
		while(low<high){
			while(arr[high]>=key && high>low){//从后半部分向前扫描
				high--;
			}
			arr[low]=arr[high];  //arr[low]=key已经提出来
			while(arr[low]<=key && high >low){//从前半部分向后扫描
				low++;
			}
			arr[high]=arr[low];
		}
		arr[high]=key;
		return high;
	}
    
	public static int partition2(int[] arr,int low,int high){
		int x=arr[high];
		int i=low-1;
		for (int j = low; j < high-1; j++) {
			if(arr[j]<=x){
				i=i+1;
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
    public static void sort(int[] array,int lo ,int hi){
        if(lo<=hi){
        int index=partition1(array,lo,hi);
        sort(array,lo,index-1);
        sort(array,index+1,hi); 
        }
    }
	public static void main(String[] args) {
		int[] arr={3,4,5,7,8,34,23,2,3,4,6,7,2,89,4};
		sort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
}
