package chapter15.eleven;

import java.util.List;

public class UseList<W,T>{

	/**
	 * 方法将会编译错误，因为泛型擦除之后，两个方法具有相同的类型签名。
	 * @param v
	 */
	void f1(List<T> v){
		
	}
	void f2(List<W> v){
		
	}
	
}
