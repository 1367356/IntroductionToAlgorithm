package dynamicProgramming;

import java.util.List;

public class TestMatrixChainMultiply {
			public static void main(String[] args) {
				MatrixChainMultiply mcm=new MatrixChainMultiply();
				int[] p={3,5,7,23,45,2,4,5,9,20};
				int i=2;
				int j=6;
				List list=mcm.matrixChainOrder(p);
				int[][] s=(int[][]) list.get(1);
				mcm.printOptimalParens(s, i, j);
			}
}
