package chapter15.eight;

/**
 * 擦除，任何需要知道确切类型信息的操作都将无法工作
 * @author admin
 *
 * @param <T>
 */
public class Erased<T> {

	private final int SIZE=100;
	public static void f(Object arg){
//		if(arg instanceof T){
//			
//		}
		//T var=new T();  T类型是确定的。
		
	}
	public void g(Object arg){
//		if(arg instanceof T){
//			
//		}
	}
}
