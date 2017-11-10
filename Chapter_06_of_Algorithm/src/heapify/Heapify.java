package heapify;

/**
 * ��
 * @author admin
 *
 */
public class Heapify {

	/**
	 * ��������ڵ�ĸ��ڵ����
	 * @param i ����ڵ�����
	 * @return
	 */
	public int parent(int i){
		return i/2;  //���ڵ�Ǳ�
	}
	public int left(int i){
		return 2*i;
	}
	public int right(int i){
		return 2*i+1;
	}
	/**
	 * ά�����ѵ�����
	 * @param arr ���ѵ������ʾ��ʽ
	 * @param i �������в�������
	 */
	public void maxHeapify(int[] arr,int i){
		int largest;
		int l=left(i);
		int r=right(i);
		if(l<=arr.length && arr[l]>arr[i]){
			largest=l;
		}else{
			largest=i;
		}
		if(r<=arr.length && arr[r]>arr[largest]){
			largest=r;
		}
		if(largest!=i){
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=arr[i];
			maxHeapify(arr, largest);
		}
	}
	public void buildMaxHeapify(int[] arr){
		int heapSize=arr.length;
		for (int i = heapSize/2; i >=1 ; i--) {
			maxHeapify(arr, i);
		}
	}
	public void heapSort(int[] arr){
		int heapSize=arr.length;
		buildMaxHeapify(arr);
		for (int i = arr.length/2; i >=2; i--) {
			int temp=arr[i];
			arr[i]=arr[1];
			arr[1]=temp;
			heapSize=heapSize-1;
			maxHeapify(arr, 1);
		}
	}
	private void heap() {
		// TODO Auto-generated method stub
		
	}
}
