package chapter15.eight;

public class FactoryConstraint {

	public static void main(String[] args) {
		new Foo2<Integer>(new IntegerFactory());
	}
}

class Foo2<T>{
	@SuppressWarnings(value = { "unchecked" })
	private T x;
	public <F extends Factory<T>>Foo2(F factory){
		x=factory.create();
	}
}

class IntegerFactory implements Factory<Integer>{

	public Integer create() {
		// TODO Auto-generated method stub
		return new Integer(0);
	}
	
}