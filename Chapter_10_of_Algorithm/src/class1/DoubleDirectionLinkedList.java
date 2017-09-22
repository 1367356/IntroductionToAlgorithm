package class1;

import class1.LinkedList.Node;

public class DoubleDirectionLinkedList <T>{
						doubleNode<T> head,current,trail=null;
						
						class doubleNode<T>{
							doubleNode<T> pre;
							doubleNode<T> next;
							T key;
						}
						public void delete(doubleNode<T> node,T key){                     //删除

							while (node.key !=key){
								node=node.next;	
							}
								if(node.pre!=null){
									node.pre.next=node.next;
								}else{
									head=node.next;
								}
								if(node.next!=null){
									node.next.pre=node.pre;
								}
//								if (node.pre==null){
//									if(node.next==null){
//										head=null;
//									}else{
//										head=node.next;
//										head.next=node.next.next;
//									}
//								}else{
//									if(node.next==null){
//										trail=node.pre;
//										trail.pre=node.pre.pre;
//									}else{
/*									        doubleNode<T> tem=node.pre;
									        doubleNode<T> tem1=node.next;
									        tem.next=node.next;
									        tem1.pre=tem;*/
//									        node.pre=tem;
//									        node.next=tem1;
									        
							//		}
								//}

						}
						
						public void insert(T key){            //插入一个节点,创建一个树结构是插入很多个的集合。
							doubleNode<T> newNode=new doubleNode<T>();
							newNode.key=key;
							newNode.next=null;
							if(head==null){
								head=newNode;
								head.pre=null;
								trail=newNode;
							}else{
								trail.next=newNode;
								newNode.pre=trail;
								trail=newNode;
							}
						}
						public  void  print(doubleNode<T> node){  //给一个头节点,打印链表
							while(node!=null){
								System.out.println(node.key);
								node=node.next;           //逆向打印双向链表
							}
			}
}
