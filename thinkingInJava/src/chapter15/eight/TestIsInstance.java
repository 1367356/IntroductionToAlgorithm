package chapter15.eight;

public class TestIsInstance {


	public static void main(String[] args) {
		System.out.println();
		System.out.println(Super.class.isInstance(new Sub()));  //true  
		System.out.println(Sub.class.isInstance(new Super()));   //false
	}
}

class Super{
	
}
class Sub extends Super{
	
}