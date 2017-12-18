package chapter17.six;

import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		//排序集合
		SortedSet<String> sortedSet=new TreeSet<String>();
		
		Collections.addAll(sortedSet, "one two three four five six".split(" "));//T...  很多参数
		
		System.out.println(sortedSet);
		
		String low=sortedSet.first();
		String high=sortedSet.last();
		System.out.println(low);
		System.out.println(high);
		
		Iterator<String> it=sortedSet.iterator();
		for (int i = 0; i < 3; i++) {
			if(i==2)
				low=it.next();
			if(i==3)
				high=it.next();
			else
				it.next();
		}
		System.out.println(low);
		System.out.println(high);
		System.out.println(sortedSet.subSet(low, high));
		System.out.println(sortedSet.headSet(high));
		System.out.println(sortedSet.tailSet(low));
	}
}
