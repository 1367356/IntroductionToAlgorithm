package binarysearch;

import org.junit.Test;

public class BinarySearch {

	/**
	 * 二分查找
	 * @param arr 数组
	 * @param des 目标值
	 * @return
	 */
	public static int binarySearch(int[] arr,int des){
		int low=0;
		int high=arr.length-1;
		int middle;
		while(low<=high){
			middle=(low+high)/2;
			if(arr[middle]==des){
				return middle;
			}else if(arr[middle]<des){
				low=middle+1;
			}else{
				high=middle-1;
			}
		}
		return -1;
	}
	
	/**
	 * 递归二分查找
	 * @param arr
	 * @param data
	 * @param beginIndex 起始角标值
	 * @param endIndex 结束角标值
	 * @return
	 */
	public static int recursionBinarySearch(int[] arr,int data,int beginIndex,int endIndex){
		int midIndex=(beginIndex+endIndex)/2;
		if(data>arr[endIndex]|| data<arr[beginIndex]|| beginIndex>endIndex){
			return -1;	
		}
		if(data>arr[midIndex]){
			return recursionBinarySearch(arr,data,midIndex+1,endIndex);
		}else if(data<arr[midIndex]){
			return recursionBinarySearch(arr,data,beginIndex,midIndex-1);
		}else{
			return midIndex;
		}
	}
	public static void main(String[] args) {
		int[] arr={3,4,5,7,8,22,34,56};
		int des=8;
//		int index = binarySearch(arr, des);
		int index=recursionBinarySearch(arr,des,0,arr.length-1);
		System.out.println(index);
	}
	
}
