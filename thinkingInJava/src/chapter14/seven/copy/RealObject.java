package chapter14.seven.copy;

import org.junit.Test;

public class RealObject implements Interface{

	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("doSomething");
	}

	public void somethingElse(String arg) {
		// TODO Auto-generated method stub
		System.out.println("something Else"+arg);
	}

}
class SimpleProxy implements Interface{

	private Interface proxied;
	public SimpleProxy(Interface proxied) {
		this.proxied=proxied;
	}
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("Simple proxy doSomething");
		proxied.doSomething();
	}

	public void somethingElse(String arg) {
		System.out.println("Simple proxy something Elese"+arg);
		proxied.somethingElse(arg);
	}
	
}
