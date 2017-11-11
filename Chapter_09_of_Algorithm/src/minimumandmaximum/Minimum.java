package minimumandmaximum;

public class Minimum {

	public static int minimum(int[] arr){
		int min=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(min>arr[i]){
				int temp=arr[i];
				arr[i]=min;
				min=temp;
			}
		}
		return min;
	}
	public static void main(String[] args) {
		int[] arr={3,4,5,23,42,2,32,3};
		int min=minimum(arr);
		System.out.println(min);
	}
}
