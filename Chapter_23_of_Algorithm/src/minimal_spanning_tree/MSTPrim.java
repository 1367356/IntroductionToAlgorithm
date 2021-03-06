package minimal_spanning_tree;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 最小生成树的prim算法，从一个节点出发，每次找到与所有加入的节点相邻的节点，
 * 权重最小的节点(之前没有加入过)加入，不能形成环。
 * 
 * @author liyafei
 * 
 */
public class MSTPrim {

	List list = new ArrayList<>();
	int count = 1;
	double[][] weights;

	class Node {
		Node link;
		Node pre;
		int weight;
		int key;
		int start;
		int end;
	}

	/**
	 * prim 算法求最小生成树,给定根节点，开始找相邻节点的最小值，算法每一步在连接集合A和A之外的节点的所有边中 选择一条轻量级边加入到A中
	 * 用一个列表将遍历过的轻量级边的节点存储起来，然后看新的轻量级边的两点是否在列表中，如果在，就不加入。
	 * 
	 * @param r  起始节点   注意：图的矩阵表示形式是对称的，可以利用
	 */
	public void mstprim(int r) {
		List list2 = new ArrayList<>();
//		for (int i = 0; i < weights.length; i++) {
//			Node node = (Node) list.get(i);
//			node.key = Integer.MAX_VALUE;
//			node.pre = null;
//		}
//		// Node node=(Node) list.get(r);
		// node.key=0;

		// double[] arr=weights[r-1]; //取出给定顶点相邻节点的权重值，然后找出几行几列。排序
		// double min = Double.MAX_VALUE;
		// int index=0; //角标值
		// for (int i = 0; i < arr.length; i++) {
		// if(arr[i]>0 && arr[i]<min){
		// min=arr[i];
		// index=i;
		// }
		// }
		// (r,index)这条线被包括进来了
		// list2.add(r);
		// if(!list2.contains(index)){
		// list2.add(index);
		// }
//		Map map = new HashMap();
		list2.add(r);
		List list3 = new ArrayList<>();
		while (list2.size() < list.size()) {
			double minest = Double.MAX_VALUE;
			int index2 = 0;
			// List list4=new ArrayList<>();
			int[] arr = new int[2];
			for (int i = 0; i < list2.size(); i++) {
				double[] arr2 = weights[(int) list2.get(i)];
				int key = (int) list2.get(i);
				for (int j = 0; j < arr2.length; j++) {
					if (arr2[j] > 0 && arr2[j] < minest) {
						// System.out.println("j             "+j);
						// System.out.println("arr2       "+arr2[j]);
						if (!list2.contains(j)) {
							minest = arr2[j];
							index2 = j;
//							map.put(key, index2);
							
							// 找个数据结构将（key,index2）存储起来
							arr[0] = key;
							arr[1] = index2;    //key是最小生成树的上一节点（从遍历过的所有节点中选出），index2最小生成树的下一节点。
							// list4.add(key);
							// list4.add(index2);
							// System.out.println(index2);
						}
					}
				}
			}
			list3.add(arr);// 存储路径，里面使用列表存储了经过的路径（key,index2）
			list2.add(index2);
		}

		// double[] weis=weights[index];
		// double[][] afteriter=new double[2][weights.length];
		// afteriter[0]=arr;
		// afteriter[1]=weis;
		for (int i = 0; i < list2.size(); i++) {
//			System.out.println("key   " + list2.get(i));
			// System.out.println("value  "+map.get(list2.get(i)));
		}
		double sum = 0;
		int index3;
		int index4;
		System.out.println("最小生成树经过的路径为");
		for (int i = 0; i < list3.size(); i++) {
			// index3=(int) list2.get(i);
			// index4=(int) list2.get((i+1));
			// sum=sum+weights[index3][index4]; //总路径
			int[] arr = (int[]) list3.get(i);

			index3 = arr[0];
			index4 = arr[1];
			sum = sum + weights[index3][index4];
			System.out.println("从节点"+index3+"到节点"+index4+",  长度为"+weights[index3][index4]);
		}
		System.out.println("总的最短路径为"+sum);
		// System.out.println(list2.size());
		// System.out.println(min);
		// System.out.println(index);
		//
	}

	/**
	 * 得到创建的带有权重的图，读出相邻节点之间的距离，然后存储到二维数组weights中。
	 * 权重图的大小比节点多1，但是角标为0的位置都没用，为了处理存储的位置与节点的编号相一致
	 */
	public double[][] getWeightArray() {
		weights = new double[list.size()][list.size()];
		for (int i = 0; i < list.size(); i++) {
			Node node = (Node) list.get(i);
			while (node != null) {
				int row = node.start - 1;
				int col = node.end - 1;
				double weight = node.weight;
				weights[row][col] = weight;
				node = node.link;
			}

		}
		return weights;
	}

	/**
	 * 打印权重图
	 */
	public void printWeightGraph() {
		double[][] weightsArray = getWeightArray();
		for (int i = 0; i < weightsArray.length; i++) {

			double[] wa = weightsArray[i];
			for (int j = 0; j < wa.length; j++) {
				System.out.print(wa[j] + "     ");
			}
			System.out.println();
		}
		System.out.println();
	}

	/**
	 * 先构建带有权重的无向图。
	 */
	public List createGraph() {
		Class clazz = this.getClass();
		/**
		 * txt文件中，例如  1 2 4 8 8    1是起始节点，2 相邻节点，4是1,2之间的权重，8是相邻节点，8是1,8之间的权重。
		 */
		InputStream ins = clazz.getResourceAsStream("/data.txt");
		Scanner scanner = new Scanner(ins);

		while (scanner.hasNextLine()) {
			String s1 = scanner.nextLine();
			Scanner oneLine = new Scanner(s1);
			Node newNode;
			Node first = null;
			Node last = null;
			while (oneLine.hasNext()) {
				String s2 = oneLine.next();
				int end = Integer.parseInt(s2);
				if (end == 999) {
					break;
				}
				newNode = new Node();
				if (first != null && oneLine.hasNext()) {
					String s3 = oneLine.next();
					int weight = Integer.parseInt(s3);
					newNode.weight = weight;
				}
				newNode.start = count;
				newNode.end = end;
				newNode.link = null;
				if (first == null) {
					first = newNode;
					last = newNode;
				} else {
					last.link = newNode;
					last = newNode;
				}
			}
			list.add(first);
			count++;
		}
		return list;
	}

}
