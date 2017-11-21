package chapter14.seven.copy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyHandler implements InvocationHandler{

	private Object proxied;//真实对象
	public DynamicProxyHandler(Object proxied) {
		// TODO Auto-generated constructor stub
		this.proxied=proxied;
	}
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("***** proxy:"+proxy.getClass()+",method:"+method+",args"+args);
		if(args!=null){
			for(Object arg:args){
				System.out.println("  "+arg);
			}
		}
		return method.invoke(proxied, args);
	}

}
