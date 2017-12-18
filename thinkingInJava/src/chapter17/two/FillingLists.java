package chapter17.two;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FillingLists {

	public static void main(String[] args) {
		List<StringAddress> list=new ArrayList<StringAddress>(
				Collections.nCopies(4, new StringAddress("hello"))
				);
		System.out.println(list);
		Collections.fill(list, new StringAddress("world"));
		System.out.println(list);
	}
}
