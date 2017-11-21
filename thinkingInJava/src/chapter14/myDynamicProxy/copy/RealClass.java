package chapter14.myDynamicProxy.copy;

public class RealClass implements ProxyInterface{

	public String doSomething() {
		// TODO Auto-generated method stub
		System.out.println("realClass");
		return "real Class";
	}

}
