package countingsort;

/**
 * 计数排序
 * @author admin
 *
 */
public class CountSort {

	/**
	 * 计数排序
	 * @param arr  原数组
	 * @param arrb 排序之后的数组
	 * @param k 为排序开辟的新数组的长度，原数组的最大值。
	 */
	public void countSort(int[] arr,int[] arrb,int k){
		int[] arrk=new int[k];
		for (int j = 0; j < arr.length; j++) {
			arrk[arr[j]]=arrk[arr[j]]+1;
		}
		for (int i = 0; i <=k; i++) {
			arrk[i]=arrk[i]+arrk[i-1];
		}
		for (int j = arr.length; j >0; j--) {
			arrb[arrk[arr[j]]]=arr[j];
			arrk[arr[j]]=arrk[arr[j]]-1;
		}
	}
}
