package chapter14.myDynamicProxy.copy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler{

	private Object real;
	public DynamicProxy(Object real) {
		// TODO Auto-generated constructor stub
		this.real=real;
	}
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("代理前");
		
		Object obj=method.invoke(real, args);  //obj  被代理对象的返回值。
		
		System.out.println("代理后");
		System.out.println(obj);
		return obj;
		
	}

}
