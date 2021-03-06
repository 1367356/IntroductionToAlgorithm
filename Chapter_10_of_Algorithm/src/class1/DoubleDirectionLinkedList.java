package class1;

import class1.LinkedList.Node;

/**
 * 双向链表
 * @author liyafei
 *
 * @param <T>  参数T是红黑树能够操作存储的泛型，红黑树是一种数据结构，因此树中节点需要存储数据，而T作为参数类型
 *                              保证了红黑树能够存储任意类型的数据，当然一个节点中也可以存储多个数据。
 *                              具有属性：头结点，当前节点，尾节点
 */
public class DoubleDirectionLinkedList <T>{
						doubleNode<T> head,current,trail=null;
						
						/**
						 * 双向节点
						 * @author liyafei
						 *
						 * @param <T>   参数T 和上面链表说明相同
						 * 								具有属性：前一节点，下一节点，泛型属性
						 */
						class doubleNode<T>{
							doubleNode<T> pre;
							doubleNode<T> next;
							T key;
						}
						
						/**
						 * 删除节点
						 * @param node		链表
						 * @param key			要删除的节点的泛型值
						 */
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
						
						/**
						 * 插入节点
						 * @param key	插入的节点值，通过比较大小，找到要插入的节点的位置
						 */
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
						
						/**
						 * 打印节点
						 * @param node 要被打印的节点
						 */
						public  void  print(doubleNode<T> node){  //给一个头节点,打印链表
							while(node!=null){
								System.out.println(node.key);
								node=node.next;           //逆向打印双向链表
							}
			}
}
