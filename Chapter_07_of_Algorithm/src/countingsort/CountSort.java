package countingsort;

/**
 * ��������
 * @author admin
 *
 */
public class CountSort {

	/**
	 * ��������
	 * @param arr  ԭ����
	 * @param arrb ����֮�������
	 * @param k Ϊ���򿪱ٵ�������ĳ��ȣ�ԭ��������ֵ��
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