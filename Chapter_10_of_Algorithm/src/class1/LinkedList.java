package class1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;


public class LinkedList<T> {
	            public Node<T> first,newNode,last=null;  //创建三个节点，头节点，新节点，尾节点
	            public int count;
				class Node<T>{
					Node<T> link;
					int info;
					T key;
				}	
				public Node<T> createLinked() throws FileNotFoundException{
					int num=0;
					String inputline;
					Class clazz=this.getClass();
					InputStream ins=clazz.getResourceAsStream("data.txt");   //通过外部数据创建链表
					Scanner scanner=new Scanner(ins);  //流输入。
 //   				Scanner scanner=new Scanner(System.in);   //Scanner录入从控制台数据，也可以从各种其它地方录入。比如InputStream in等。
 				while(scanner.hasNextLine()){
//						inputline=scanner.toString();
//						num=Integer.parseInt(inputline);
 					
						String s=scanner.nextLine();
						Scanner oneLine=new Scanner(s);
//						if (oneLine==null)
//							break;
						while(oneLine.hasNext()){
							String s1=oneLine.next();
							num=Integer.parseInt(s1);
							if(num==999)
								break;
							newNode=new Node<T>();
							newNode.info=num;
							newNode.link=null;
							if(first ==null){
								first=newNode;
								last=newNode;
							}else{
								last.link=newNode;
								last=newNode;
							}
						}
						
			        }
 				return first;
 				
				}
				public  void insert(int i){                  //插入链表数据，可以用这个方法来创建链表，也可以读入数据来创建。
					Node<T> newNode=new Node<T>();
					newNode.info=i;
					newNode.link=null;
					if(first==null){
						first=newNode;
						last=newNode;
					}else{
						last.link=newNode;
						last=newNode;
					}
                     count++;
				}
				public  void  print(Node<T> node){  //给一个头节点,打印链表
					while(node!=null){
						System.out.println(node.info);
						node=node.link;
					}
				}
				public  int getLength(Node<T> node){  //获取链表长度
					int length=0;
					while(node!=null){
						node=node.link;
						length++;
					}
					return length;
				}
}
