package MaxflowMincut;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 图结构
 * @author liyafei
 *
 * @param <T>  泛型
 */
public class Graph{
					
					protected Node[] graph;  //以数组的方式存储图，需要初始化指定数组的长度
					protected List<Node> list=new ArrayList<Node>();  //以数组列表的形式存放图，可以不用初始化，直接添加
					protected int maxSize;
					protected int gSize;
					public int count=0;
					public Graph(int maxSize,int gSize){
						this.maxSize=maxSize;
						this.gSize=gSize;
						graph=new Node[maxSize];
					}
					/**
					 *图中的节点
					 * @author liyafei
					 *
					 * @param <> 节点中的泛型
					 * 有三个属性，下一节点，关键字，两个节点之间的权重，
					 * 权重应该以矩阵的方式存储（也就是一个二维数组）
					 * 可以使用一个开始值（start）和结束值(end)来代表权重(weight)是哪两个节点的。
					 * 例如：start=2，end=4,weight=8,那么表示2号节点和4号节点之间的权重值为8；
					 */
					public class Node{
						double weight;  
						Node link;
						int key;
						int start;
						int end;
						String color="WHITE";
					}
					
					/**
					 * 清空图
					 */
					public void clearGraph(){
						for (int index = 0; index < graph.length; index++) {
							graph[index]=null;
						}
					}
					
					/**
					 * 创建图，以链表的方式创建图
					 * @return 返回图的链表形式，其中数组中每个位置是一个顶点的链表
					 */
//					public Node[]  createGraph(){
					public List  createGraph(){
						Class clazz=this.getClass();
						InputStream ins=clazz.getResourceAsStream("/data1.txt");   //通过外部数据创建链表,使用/加载src目录下的文件
							                                                                                  //不使用/是加载类路径下的文件
						Scanner scanner=new Scanner(ins);  //流输入。
	 				while(scanner.hasNextLine()){
							String s=scanner.nextLine();
							Scanner oneLine=new Scanner(s);
							Node first=null;
							Node newNode,last=null;
							while(oneLine.hasNext()){
								String s1=oneLine.next();
								int num=Integer.parseInt(s1);
								if(num==999)
									break;
								newNode=new Node();
								newNode.key=num;
								newNode.link=null;
								if(first ==null){
									first=newNode;
									last=newNode;
								}else{
									last.link=newNode;
									last=newNode;
								}
							}
							graph[count]=first;
							list.add(first);
							count++;
				        }
	 				return list;
					}
					
					/**
					 * 打印图中某个指定节点链表的长度
					 * @param node 需要求长度的节点
					 * @return  节点的长度
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
					 * 打印图，以数组列表的形式存储链表，构成图
					 */
					public void printGraph(){
						for (int i = 0; i < list.size(); i++) {   

							Node first=(Node) list.get(i);
							if(first==null){
								break;
							}
							System.out.println("打印了第"+(i+1)+"个节点的数据");
							while(first!=null){
								System.out.print(first.key+"  ");
								first=first.link;
							}
							System.out.println("");
						}
					}
}
