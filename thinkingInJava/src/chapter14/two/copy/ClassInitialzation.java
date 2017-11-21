package chapter14.two.copy;

import java.util.Random;

public class ClassInitialzation {

	public static Random rand=new Random(47);
	public static void main(String[] args) {
		Class initable=Initable.class;
		System.out.println("after creating Initable ref");
		System.out.println();
		System.out.println();
	}
}
