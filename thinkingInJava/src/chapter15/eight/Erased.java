package chapter15.eight;

/**
 * �������κ���Ҫ֪��ȷ��������Ϣ�Ĳ��������޷�����
 * @author admin
 *
 * @param <T>
 */
public class Erased<T> {

	private final int SIZE=100;
	public static void f(Object arg){
		if(arg instanceof T){
			
		}
		T var=new T();
		
	}
	public void g(Object arg){
		if(arg instanceof T){
			
		}
	}
}