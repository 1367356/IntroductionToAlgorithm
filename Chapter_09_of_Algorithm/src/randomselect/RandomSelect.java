package randomselect;

public class RandomSelect {
	public int randomSelect(int[] arr,int p,int r,int i){
		if(p==r){
			return arr[p];
		}
		int q=randomPartition(arr,p,r);
		int k=q-p+1;
		if(i==k){
			return arr[q];
		}else if(i<k){
			return randomSelect(arr, p, q-1, i);
		}else{
			return randomSelect(arr, q+1, r, i-k);
		}
	}

	private int randomPartition(int[] arr, int p, int r) {
		// TODO Auto-generated method stub
		return 0;
	}
}
