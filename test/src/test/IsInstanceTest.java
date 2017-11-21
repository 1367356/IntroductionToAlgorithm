package test;

public class IsInstanceTest {

	public static void main(String[] args) {
		System.out.println();
		System.out.println(Super.class.isInstance(new Sub()));
		System.out.println(Sub.class.isInstance(new Super()));
	}
}

class Super{
	
}
class Sub extends Super{
	
}