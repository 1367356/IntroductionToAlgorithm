package chapter10.eight;

/**
 * 含有内部类对象
 * @author admin
 *
 */
public class Callee2 extends MyIncrement{

	private int i=0;
	public void increment() {   //父类中已经含有increment
		super.increment();
		i++;
		System.out.println(i);
	}
	private class Closure implements Incrementable{

		public void increment() {   //也需要实现Incrementable的increment方法，所以使用内部类去实现。
			// TODO Auto-generated method stub
			Callee2.this.increment();
		}
	}
	Incrementable getCallbackReference(){
		return new Closure();
	}
}
