package chapter17.four;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Unsupported {

	static void test(String msg,List<String> list){
		System.out.println("------"+msg+"------------");
		Collection<String> c=list;
		Collection<String> subList=list.subList(1, 4);
		//copy of subList
		Collection<String> c2=new ArrayList<String>(subList);
		try {
			c.retainAll(c2);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("retainAll"+e);
		}
		try {
			c.removeAll(c2);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("removeALL"+e);
		}
	}
	public static void main(String[] args) {
		List<String> list=Arrays.asList("A B C D E F G H I J K L M ".split(" "));
		test("Modifiable", new ArrayList<String>(list));
		test("Arrays.asList()",list);
		test("unmodifiableList()",Collections.unmodifiableList(new ArrayList<String>(list)));
	}
}
