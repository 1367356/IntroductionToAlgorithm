package class1;

import java.io.FileNotFoundException;

import class1.LinkedList.Node;

public class TestClass {
	            public static LinkedList<Integer> ll=new LinkedList<Integer>();
				public static void main(String[] args) throws FileNotFoundException {
					
					ll.insert(5);   //插入链表数据
					ll.insert(9);  //插入链表数据。
					ll.createLinked();
					
					Node node=ll.first;
					int i=ll.getLength(node);
					System.out.println(i);
					
					ll.print(node);
				}


}
