package recurmerge;

import java.util.Arrays;

public class RecursionMerge {

	/**
	 * 递归合并排序算法（归并）
	 */
	/**
	 * 合并
	 * @param arr1
	 * @param arr2
	 */
	public static void merge(int[] nums,int low,int mid,int high){
		int[] temp=new int[high-low+1];
		int i=low;//左指针
		int j=mid+1;//右指针
		int k=0;
		
		//把较小的数先移到新数组中
		while(i<=mid && j<=high){
			if(nums[i]<nums[j]){
				temp[k++]=nums[i++];
			}else{
				temp[k++]=nums[j++];
			}
		}
		//把左边剩余的数移入数组
		while(i<=mid){
			temp[k++]=nums[i++];
		}
		//把右边剩余的数移入数组
		while(j<=high){
			temp[k++]=nums[j++];
		}
		//把新数组中的数覆盖nums数组
		for (int k2 = 0; k2 < temp.length; k2++) {
			nums[k2+low]=temp[k2];
		}
	}
	public static int[] recur(int[] arr,int low,int high){
		int mid=(low+high)/2;
		if(low<high){
			//左边
			recur(arr, low, mid);
			//右边
			recur(arr, mid+1, high);
			//左右合并
			merge(arr, low, mid, high);
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr={3,2,4,5,6,2,4,6,7,8,3};
		recur(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
