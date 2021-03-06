package chapter11.seven;

import java.lang.reflect.Proxy;

public class SimpleDynamicProxy {
	
	public static void consumer(Interface inter) {
		inter.doSomething();
		inter.somethingElse("bonono");
	}
	public static void main(String[] args) {
		RealObject real=new RealObject();
		consumer(real);
		Interface proxy=(Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(), new Class[]{
			Interface.class
		}, new DynamicProxyHandler(real));   
		consumer(proxy);
	}
}
