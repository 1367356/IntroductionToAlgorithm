package recurmerge;

import java.util.Arrays;

public class RecursionMerge {

	/**
	 * �ݹ�ϲ������㷨���鲢��
	 */
	/**
	 * �ϲ�
	 * @param arr1
	 * @param arr2
	 */
	public static void merge(int[] nums,int low,int mid,int high){
		int[] temp=new int[high-low+1];
		int i=low;//��ָ��
		int j=mid+1;//��ָ��
		int k=0;
		
		//�ѽ�С�������Ƶ���������
		while(i<=mid && j<=high){
			if(nums[i]<nums[j]){
				temp[k++]=nums[i++];
			}else{
				temp[k++]=nums[j++];
			}
		}
		//�����ʣ�������������
		while(i<=mid){
			temp[k++]=nums[i++];
		}
		//���ұ�ʣ�������������
		while(j<=high){
			temp[k++]=nums[j++];
		}
		//���������е�������nums����
		for (int k2 = 0; k2 < temp.length; k2++) {
			nums[k2+low]=temp[k2];
		}
	}
	public static int[] recur(int[] arr,int low,int high){
		int mid=(low+high)/2;
		if(low<high){
			//���
			recur(arr, low, mid);
			//�ұ�
			recur(arr, mid+1, high);
			//���Һϲ�
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
