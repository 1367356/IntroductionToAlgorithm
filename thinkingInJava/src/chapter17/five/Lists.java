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
		it=a.iterator();//��listת��Ϊ������
		lit=a.listIterator();//ר�����list�ĵ�����
		lit=a.listIterator(3);//�ӽǱ�ֵ��ʼ�����ɵ�����
		i=a.lastIndexOf("1");//���һ��ƥ���Ԫ�ؽǱ�ֵ
		
		a.remove(1);
		a.remove("3");
		a.set(1, "y");//����Ԫ��
		
		a.retainAll(new ArrayList<String>(Arrays.asList("A B C D".split(" ")))); //�����б��Ľ�
		a.clear();//������е�Ԫ��
	}
	
	//����list�����ĵ����������еķ���
	public static void iterMotion(List<String> a){
		ListIterator<String> it=a.listIterator();
		b=it.hasNext();
		b=it.hasPrevious();
		s=it.next();
		i=it.nextIndex();//��һ���Ǳ�ֵ
		s=it.previous();  //ǰһ��Ԫ��
		i=it.previousIndex();
	}
	
	//����������
	public static void iterManipulation(List<String> a){
		ListIterator<String> it=a.listIterator();
		it.add("47");//����������Ԫ�أ�����֮������ƶ�Ԫ��
		it.next();
		it.remove();
		it.set("e");
	}
	
	//test visual
	public static void testVisual(List<String> a){
		System.out.println(a);
		List<String> b = null;
		a.addAll(b);//���б��������б���
		
		ListIterator<String> x=a.listIterator(a.size()/2);  //��ĳһ���Ǳ꿪ʼ�����ɵ�����
		x.add("one");
		System.out.println(a);
		System.out.println(x.next());
		x.remove();
		System.out.println(x.next());
		x.set("47");
		System.out.println(a);
		//�����ӡiterator
		x=a.listIterator(a.size());
		while (x.hasPrevious()) {
			System.out.println(x.previous());
		}
		System.out.println("testVisual finished");
	}
	
	//LinkedList�����еĲ���
	public static void testLinkedList(){
		LinkedList<String> ll=new LinkedList<String>();
		ll.addAll(new ArrayList<String>(Arrays.asList("A B C D E".split(" "))));
		System.out.println(ll);
		ll.addFirst("one");
		ll.addLast("two");
		System.out.println(ll.getFirst());
		System.out.println(ll.removeFirst()); //�Ƴ�Ԫ�أ��ڴ�ͬʱ���Ƴ���Ԫ�ط���
		
	}
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		basicTest(list);
		System.out.println(list.toString());
	}
}