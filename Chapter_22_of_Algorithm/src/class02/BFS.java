package class02;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

import RepresentationGraph.Graph.Node;



/**
 * 广度优先搜索：第22章第二节
 * @author liyafei
 *
 */
public class BFS {
	List q=new ArrayList<>();
	List list=new ArrayList();


	public void printPath(int s,double v){
		//System.out.println(list.size());
		Node sn=(Node) list.get(s);   
		Node vn=(Node) list.get((int)v);
		if(s==v){
			   System.out.println(sn.key);
		   }else if(vn.pre==null){      //vn的前驱为空
			   System.out.println("no path from  "+s+"  to  "+v+"  exists");
		   }else{           //递归，vn的前驱，也就是v逐渐向前跑
			   printPath(s, vn.pre.key);
			   System.out.println(vn.key);
		   }
	}
	
	/**
	 * 广度优先搜索，给定节点，搜索路径
	 * @param vertex 给定的节点
	 */
	public void breadthFirstSearch(int vertex){
		boolean[] nodeFound=new boolean[list.size()];
		for (int i = 0; i < list.size(); i++) {
			if(i!=vertex){
				Node node=(Node) list.get(i);
				node.color="WHITE";
				node.d=Double.MAX_VALUE;
				node.pre=null;
				nodeFound[i]=false;
			}else{
				nodeFound[i]=true;
			}
		}
		
		Node s=(Node) list.get(vertex);
		s.color="GRAY";
		s.d=0;
		s.pre=null;
		
		q.add(s);

		while(q.size()!=0){
			Node u=(Node) q.remove(0);
			int length=getLength(u);
			for (int i = 0; i < length; i++) {
				Node v = null;
				v=u;
				for (int j = 0; j <= i; j++) {
					v=v.link;
				}
				if(!nodeFound[v.key-1]){
					v.color="GRAY";
					v.d=u.d+1;
					v.pre=u;
					q.add(v);
					nodeFound[v.key-1]=true;
				}
			}
			//System.out.println(q.size());
			u.color="BLACK";
		}
	}

	/**
	 * 图节点
	 * @author liyafei
	 *
	 */
	public class Node{
		Node pre;  //前驱节点
		Node link;
		int key;
		String color="WHITE";
		double d=0;
	}
	
	/**
	 * 创建图，以链表的方式创建图
	 * @return 返回图的链表形式，其中数组中每个位置是一个顶点的链表
	 */
//	public Node[]  createGraph(){
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
			list.add(first);
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
	 * 打印图
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
