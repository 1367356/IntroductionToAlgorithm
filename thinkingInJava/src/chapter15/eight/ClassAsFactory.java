package chapter15.eight;

public class ClassAsFactory<T> {

	T x;
	public ClassAsFactory(Class<T> kind) throws Exception {
		// TODO Auto-generated constructor stub
			x=kind.newInstance();  //产生一个参数类型对象

	}
}

class Employee{
	
}