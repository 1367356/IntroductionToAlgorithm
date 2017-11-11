package quicksort;

/**
 * ��������
 * @author admin
 *
 */
public class QuickSort {

	/**
	 * ��������ݹ�
	 * @param arr ����
	 * @param low ���ֵ
	 * @param high ���ֵ
	 */
	public void quickSort(int[] arr,int low,int high){
		if(low<high){
			int q=partition(arr,low,high);
			quickSort(arr, low, q-1);
			quickSort(arr, q+1, high);
		}
	}

	/**
	 * ��������ȡ��������ֵ
	 * @param arr ����
	 * @param low ���ֵ
	 * @param high ���ֵ
	 */
	private int partition(int[] arr, int low, int high) {
		int x=arr[high];
		int i=low-1;
		int temp;
		for (int j = low; j < high; j++) {
			if(arr[j]<x){
				i=i+1;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp1=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp1;
		return i+1;
	}
}
