package chapter15.eleven;

public class GenericCast {

	public static final int SIZE=7;
	public static void main(String[] args) {
		FixedSizeStack<String> strings=new FixedSizeStack<String>(SIZE);
		for(String s:"A B C D E F G".split(" "))
			strings.push(s);
		for (int i = 0; i < SIZE; i++) {
			String s=strings.pop();
			System.out.println(s+" ");
		}
	}
}
