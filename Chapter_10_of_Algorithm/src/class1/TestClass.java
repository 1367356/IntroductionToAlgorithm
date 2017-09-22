package class1;

import java.io.FileNotFoundException;

import org.omg.PortableInterceptor.INACTIVE;

import class1.DoubleDirectionLinkedList.doubleNode;
import class1.LinkedList.Node;

public class TestClass {

				public static void main(String[] args) throws FileNotFoundException {
					//单链表测试
//                  LinkedList<Integer> ll=new LinkedList<Integer>();
//                  ll.insert(6);
//                  ll.insert(6);
//                  Node first=ll.first;
//                  ll.print(first);
					
					DoubleDirectionLinkedList<Integer> ddll=new DoubleDirectionLinkedList<>();
					ddll.insert(54);
					ddll.insert(5);
					ddll.insert(40);
					ddll.insert(45);
					ddll.insert(98);
					doubleNode node=ddll.head;   //逆向打印
					ddll.print(node);
					System.out.println("删除后");
					ddll.delete(node, 40);
					ddll.print(node);


}
}
