package chapter14.myDynamicProxy.copy;

import java.lang.reflect.Proxy;

public class TestDynamicProxy {

	public static void main(String[] args) {
		ProxyInterface proxy=(ProxyInterface) Proxy.newProxyInstance(ProxyInterface.class.getClassLoader(),
				RealClass2.class.getInterfaces(), new DynamicProxy(new RealClass2()));
		proxy.doSomething();
	}
	
}
