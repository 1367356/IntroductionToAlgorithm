package chapter10.eight;

public class Callee1 implements Incrementable{
	private int i=0;
	public void increment() {
		// TODO Auto-generated method stub
		i++;
		System.out.println(i);
	}
}
class MyIncrement{
	public void increment(){
		System.out.println("other operation");
	}
	static void f(MyIncrement mi){
		mi.increment();
	}
}