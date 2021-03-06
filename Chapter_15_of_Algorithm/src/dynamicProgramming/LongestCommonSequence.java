package dynamicProgramming;

import java.util.ArrayList;
import java.util.List;
/**
 * 求两个序列的最长公共子序列类
 * @author liyafei
 *
 */
public class LongestCommonSequence {
			List list=new ArrayList<>();
			
			/**
			 * 求最长公共子序列的方法。
			 * @param x 序列1
			 * @param y  序列2
			 * @return 返回最长公共子序列和标记
			 */
			public List LCSLength(char[] x,char[] y){
				int m=x.length;
				int n=y.length;
				int[][] c=new int[m][n];
				String[][] b=new String[m][n];
				
				for (int i = 1; i < n; i++) {
					for (int j = 1; j < n; j++) {
						if(x[i]==y[j]){
							c[i][j]=c[i-1][j-1]+1;
							b[i][j]="↖";
						}else if(c[i-1][j] >=c[i][j-1]){
							c[i][j]=c[i-1][j];
							b[i][j]="↑";
						}else{
							c[i][j]=c[i][j-1];
							b[i][j]="←";
						}
					}
				}
				list.add(b);
				list.add(c);
				return list;
			}
			public void printLCS(String[][] b,char[] x,int i,int j){
				if(i==0 || j==0){
					return;
				}
				if(b[i][j]=="↖"){
					printLCS(b, x, i-1, j-1);
					System.out.println(x[i]);
				}else if(b[i][j]=="↑"){
					printLCS(b, x, i-1, j);
				}else{
					printLCS(b, x, i, j-1);
				}
			}
}
