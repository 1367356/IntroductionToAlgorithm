package chapter17.eleven;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Utilities {

	static List<String> list=Arrays.asList("one two three four five".split(" "));
	
	public static void main(String[] args) {
		System.out.println(list);
		System.out.println("'list' disjoint (Four) ?:" +Collections.disjoint(list, Collections.singletonList("three")));
		
	}
}
