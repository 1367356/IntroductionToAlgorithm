package chapter17.five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Lists {

	private static boolean b;
	private static String s;
	private static int i;
	private static Iterator<String> it;
	private static ListIterator<String> lit;
	
	public static void basicTest(List<String> a){
		a.add(1, "x");//add at location 1
		a.add("x");
		b=a.contains("1");
		s=a.get(1);
		i=a.indexOf("1");
		b=a.isEmpty();
		it=a.iterator();//将list转化为迭代器
		lit=a.listIterator();//专门针对list的迭代器
		lit=a.listIterator(3);//从角标值开始处生成迭代器
		i=a.lastIndexOf("1");//最后一个匹配的元素角标值
		
		a.remove(1);
		a.remove("3");
		a.set(1, "y");//设置元素
		
		a.retainAll(new ArrayList<String>(Arrays.asList("A B C D".split(" ")))); //两个列表的交
		a.clear();//清除所有的元素
	}
	
	//测试list产生的迭代器所含有的方法
	public static void iterMotion(List<String> a){
		ListIterator<String> it=a.listIterator();
		b=it.hasNext();
		b=it.hasPrevious();
		s=it.next();
		i=it.nextIndex();//下一个角标值
		s=it.previous();  //前一个元素
		i=it.previousIndex();
	}
	
	//迭代器操作
	public static void iterManipulation(List<String> a){
		ListIterator<String> it=a.listIterator();
		it.add("47");//迭代器添加元素，添加之后必须移动元素
		it.next();
		it.remove();
		it.set("e");
	}
	
	//test visual
	public static void testVisual(List<String> a){
		System.out.println(a);
		List<String> b = null;
		a.addAll(b);//向列表中添加列表。
		
		ListIterator<String> x=a.listIterator(a.size()/2);  //从某一个角标开始处生成迭代器
		x.add("one");
		System.out.println(a);
		System.out.println(x.next());
		x.remove();
		System.out.println(x.next());
		x.set("47");
		System.out.println(a);
		//逆向打印iterator
		x=a.listIterator(a.size());
		while (x.hasPrevious()) {
			System.out.println(x.previous());
		}
		System.out.println("testVisual finished");
	}
	
	//LinkedList所特有的操作
	public static void testLinkedList(){
		LinkedList<String> ll=new LinkedList<String>();
		ll.addAll(new ArrayList<String>(Arrays.asList("A B C D E".split(" "))));
		System.out.println(ll);
		ll.addFirst("one");
		ll.addLast("two");
		System.out.println(ll.getFirst());
		System.out.println(ll.removeFirst()); //移除元素，于此同时，移除的元素返回
		
	}
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		basicTest(list);
		System.out.println(list.toString());
	}
}
