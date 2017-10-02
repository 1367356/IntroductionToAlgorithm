package class03;


import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import class02.BFS;
import class02.BFS.Node;

/**
 * 深度优先搜索，用二维数组（矩阵）将图存储起来，处理起来会更方便一些。
 * @author liyafei
 *
 */
public class DFS {
	List list=new ArrayList();
	int time;
	class Node{
		Node pre;
		Node link;
		String color;
		double d;  //本节点找到的时间
		double f;  //本节点结束的时间
		int key;    //通过key的值判断两个节点是否为同一个节点
	}
	
	public void dfs(){
		for (int i = 0; i < list.size(); i++) {
			Node node=(Node) list.get(i);
			node.color="WHITE";
			node.pre=null;
		}
		time=0;
		for (int i = 0; i < list.size(); i++) {
			Node node=(Node) list.get(i);
			if(node.color.equals("WHITE")){
				dfsVisit(node);
			}
		}
		
	}
	private void dfsVisit(Node node) {
		// TODO Auto-generated method stub
		time=time+1;
		node.d=time;
		Node nodeBak=(Node) list.get(node.key);
		nodeBak.color="GRAY";
		
	}
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
	
	
}
