package test;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

	static List list=new ArrayList();
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			list.add(Integer.valueOf(i));
		}
		for (Integer i:new ArrayList<Integer>(list)) {
			System.out.println(list.indexOf(i));
			list.remove(i);
		}
			
	}
}
