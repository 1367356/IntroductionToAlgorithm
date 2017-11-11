package bucketsort;

import java.util.ArrayList;
import java.util.List;

public class BucketSort {

	public void bucketSort(int[] arr){
		int n=arr.length;
		List arrb=new ArrayList();
		List empty=new ArrayList();
		for (int i = 0; i < n; i++) {
			arrb.set(i,empty);
		}
		for (int i = 0; i < n; i++) {
			List list=(List) arrb.get(i);
			list.add(i,Integer.valueOf(arr[i]));
		}
		for (int i = 0; i < arr.length; i++) {
			/**
			 * 对数组arrb进行排序
			 */
		}
		
	}
}
