package chapter17.nine.three;

public class StringHashCode {

	public static void main(String[] args) {
		String[] hellos="Hello Hello".split(" ");
		
		System.out.println(hellos[0].hashCode());
		System.out.println(hellos[1].hashCode());
	}
}
