package MaxflowMincut;

import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/**
 * Dijkstra算法求单源最短路径。
 * @author liyafei
 *
 */
public class DijkstraAlgorithm {
	protected Node[] graph; // 以数组的方式存储图，需要初始化指定数组的长度
	protected List<Node> list = new ArrayList<Node>(); // 以数组列表的形式存放图，可以不用初始化，直接添加
	Graph graphObj=new Graph(100,0);
	protected int maxSize;
	protected int gSize;
	public int count = 1;
	public double[][] weights;
	double[] smallWeight;
	int v=0;  //定义一个常量，用于记录最小点数
	
	List<List> list2=new ArrayList<>();   //这个列表中的元素为列表，元素列表用来记录查询最短路径过程中，
	//保存每个节点被查询到之前所经历的路径的。
	
	/**
	 * 构造函数
	 * @param maxSize
	 * @param gSize
	 */
	public DijkstraAlgorithm(int maxSize, int gSize) {
		this.maxSize = maxSize;
		this.gSize = gSize;
		graph = new Node[maxSize];          //存放节点的数组初始化，可以用List代替。
	}

	/**
	 * 图中的节点
	 * 
	 * @author liyafei
	 * 
	 * @param <> 节点中的泛型 有三个属性，下一节点，关键字，两个节点之间的权重， 权重应该以矩阵的方式存储（也就是一个二维数组）
	 *        可以使用一个开始值（start）和结束值(end)来代表权重(weight)是哪两个节点的。
	 *        例如：start=2，end=4,weight=8,那么表示2号节点和4号节点之间的权重值为8；
	 *        可以在data.txt里面每个相邻节点后面跟上权重值。 如果求最短距离时，可以用sumWeight记录到该节点总距离的最短距离
	 *			在执行广度优先搜索或者深度优先搜索时，可以用color标记每个节点的颜色，代表每个节点是否已经被搜索过。
	 */
	public class Node {
		double weight;
		Node link;
		int key;
		int start;
		int end;
		double sumWeight=0;
		String color="WHITE";
	}

	/**
	 * 得到创建的带有权重的图，读出相邻节点之间的距离，然后存储到二维数组weights中。
	 * 权重图的大小比节点多1，但是角标为0的位置都没用，为了处理存储的位置与节点的编号相一致
	 */
	public double[][] getWeightArray(){
		weights=new double[list.size()][list.size()];
		for (int i = 0; i < list.size(); i++) {
			Node node=(Node) list.get(i);
			while(node!=null){
			int row=node.start-1;
			int col=node.end-1;
			double weight=node.weight;
			weights[row][col]=weight;
			node=node.link;
			}
		}
		return weights;
	}
	
	/**
	 * 根据权重数组，求最短路径。找出给定节点到所有节点的最短路径，将路径保存在列表里面，
	 * 单源节点到终点的最短距离。
	 */
	public List shortestPathOfBFS(int vertex,int end){
//		int v=0;  //定义一个常量，用于记录最小点数
		double minWeight;//定义一个常量，记录最小权重
		double[][] weis=getWeightArray();

		int vertexNum=weis.length;
		int k=weis[vertex].length;
		smallWeight=new double[k];
		for (int i = 0; i < smallWeight.length; i++) {
			smallWeight[i]=weights[vertex][i];//将与vertex相邻节点的距离复制出来
		}
		boolean[] weightFound=new boolean[vertexNum];
		for (int i = 0; i < weightFound.length; i++) {
			weightFound[i]=false;
			List li=new ArrayList<>();
			li.add(vertex);
			list2.add(li);
		}
		weightFound[vertex]=true;
		smallWeight[vertex]=0; //源节点到源节点的距离设为0
		
		for (int i = 0; i < weightFound.length; i++) {
			minWeight=Double.MAX_VALUE;
			for (int j = 0; j < weightFound.length; j++) {
				if(!weightFound[j]){
					if(smallWeight[j]<minWeight && smallWeight[j]>0){
						v=j;
						minWeight=smallWeight[v];   //与vertex相邻的节点最小距离,每次找到一个最小值。
					}
				}
			}
			list2.get(v).add(v);
			weightFound[v]=true;	//最小的距离标记
			if(v==end){   //找到终点之后就结束。
				//System.out.println(v);
				break;
			}
			
			for (int j = 0; j < weightFound.length; j++) {
				if(!weightFound[j]){
					if(minWeight+weis[v][j]<smallWeight[j]){    //如果从源点到v点加上从v点到j点的值，与从源点到j点值比较大小。
						smallWeight[j]=minWeight+weis[v][j];
						
						//(v,j)的值记录下来，这是从源节点到j节点经过的路径为v。
						list2.get(j).add(v);
					}
				}
			}
		}
		return list2;
	}
	
	/**
	 * 打印BFS最短距离
	 * @param vertex 顶点
	 * @param end  终点
	 */
	public void printShortestPathOfBFS(int vertex,int end){
//		shortestPathOfBFS(vertex,end);
		DecimalFormat twoDigits=new DecimalFormat("0.00");
//		System.out.println("source vertex"+vertex);
//		System.out.println("shortest distance from the source to each vertex");
////		for (int i = 0; i < list.size(); i++) {
//			System.out.println("  "+(i)+"\t\t"+twoDigits.format(smallWeight[i]));
//			System.out.println(" ");
//		}
		System.out.println("从源点"+vertex+"到终点"+end+"的最短距离 "+"\t\t"+twoDigits.format(smallWeight[v]));
		System.out.println("经过的路径");
		for (int i = 0; i < list2.get(end).size(); i++) {
			System.out.println(list2.get(end).get(i));//依次打印从源节点到终点的路径。
		}

		double d=minValueofPath(list2.get(end));//将这条路径上的最小值找出，用于求最大流最小割问题。
		System.out.println("路径上的容量最小值"+d);
	}
	
	/**
	 * 找出源节点到终止节点路径上的最小容量。
	 * @param list3  存放源节点到终止节点路径上节点的列表
	 * @return  源节点到终止节点路径上最小容量
	 */
	public double  minValueofPath(List list3) {
		// TODO Auto-generated method stub
		double d =Double.MAX_VALUE;
		double weight;
		for (int i = 0; i < list3.size()-1; i++) {
			weight=weights[(int) list3.get(i)][(int) list3.get(i+1)];
			if(weight<d){
				d=weight;
			}
		}
		return d;
	}

	/**
	 * 得到链表的长度
	 * @param node
	 * @return
	 */
	public int getLength(Node node){
		int length=0;
		while(node.link!=null){
			node=node.link;
			length++;
		}
		return length;
	}

	/**
	 * 创建图，以链表的方式创建图
	 * 
	 * @return 返回图的链表形式，其中数组中每个位置是一个顶点的链表
	 */
	// public Node[] createGraph(){
	public List createGraph(String sourcePath) {
		Class clazz = this.getClass();
		InputStream ins = clazz.getResourceAsStream(sourcePath); // 通过外部数据创建链表,使用/加载src目录下的文件
																	// 不使用/是加载类路径下的文件
		Scanner scanner = new Scanner(ins); // 流输入。
		while (scanner.hasNextLine()) {
			String s = scanner.nextLine();
			Scanner oneLine = new Scanner(s);
			Node first = null;
			Node newNode = null, last = null;
			while (oneLine.hasNext()) {
				String s1 = oneLine.next();

				int num = Integer.parseInt(s1);
				if (num == 999)
					break;
				newNode = new Node();

				if (first != null && oneLine.hasNext()) { // 创建first之后，读取下一节点时再读取权重
					String s2 = oneLine.next();// 读取权重
					double weight = Double.parseDouble(s2);
					newNode.weight = weight;
					newNode.end = num;
				}

				// newNode.key=num; // 被 newNode.end=num;代替了

				newNode.start = count;

				newNode.link = null;
				if (first == null) {
					newNode.weight = 0;
					newNode.end = count;
					first = newNode;
					last = newNode;
				} else {
					last.link = newNode;
					last = newNode;
				}
			}
			graph[count] = first;
			list.add(first);
			count++;
		}
		return list;
	}
	
	/**
	 * 打印构建的图，起始节点，终止节点，起始节点到终止节点的权重
	 */
	public void printGraph(){
		for (int i = 0; i < list.size(); i++) {
			Node node=(Node) list.get(i);
//			System.out.println("以第"+(i+1)+"个节点为头节点的链表");
			//System.out.println(node.key);
			while(node!=null){
//			System.out.print("起始节点"+node.start+"        ");
//			System.out.print("终止节点"+node.end+"           ");
//			System.out.println("起始节点到终止节点的权重"+node.weight);
			node=node.link;
			}
		}
	}
	/**
	 * 打印权重图
	 */
	public void printWeightGraph(){
		double[][] weightsArray=getWeightArray();
		for (int i = 0; i < weightsArray.length; i++) {
			System.out.println();
			double[] wa=weightsArray[i];
			for (int j = 0; j < wa.length; j++) {
				System.out.print(wa[j]+"    ");
			}
			
		}
		System.out.println();
	}
}
