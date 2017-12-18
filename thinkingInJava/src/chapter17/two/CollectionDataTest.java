package chapter17.two;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

import chapter15.three.Generator;

public class CollectionDataTest {

	public static void main(String[] args) {
		Set<String> set=new LinkedHashSet<String>(
		new CollectionData<String>(new Goverment(), 7));
		
		//using the convenience method
		set.addAll(CollectionData.list(new Goverment(), 7));
		System.out.println(set);
	}
}
