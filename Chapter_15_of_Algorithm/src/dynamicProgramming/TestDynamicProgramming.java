package dynamicProgramming;

public class TestDynamicProgramming {
			public static void main(String[] args) {
				int[] p={0,1,5,8,9,10,17,17,20,24,30};
				int n=7;  //输入的n，实际为n-1 ;  因为java角标是从0开始的
				DynamicProgramming dp=new DynamicProgramming();
				int maxProce=dp.memoizedCutRod(p, n);
				System.out.println(maxProce);
			}
}
