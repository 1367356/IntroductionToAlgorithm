package activitySelector;

/**
 * 贪心算法：贪心算法每一步找到最好的值，不考虑后效性
 * @author liyafei
 *
 */
public class GreedyActivitySelector {
	
			/**
			 * 贪心活动选择
			 * @param a 活动数组
			 * @param s 活动开始时间数组
			 * @param f  活动结束时间数组
			 * @return
			 */
			public String greedyactiivitySeletor(String[] a,int[] s,int[] f){
				String A="";
				int n=s.length;
				A=A+a[0];
				int k=0;
				for (int m = 1; m < n; m++) {
					if(s[m]>=f[k]){
						A=A+a[m];
						k=m;
					}
				}
				return A;
			}
}
