package chapter10.eight;

/**
 * ִ�лص��Ķ���
 * @author admin
 *
 */
public class Caller {

	private Incrementable callbackReference;
	public Caller(Incrementable cbh) {
		// TODO Auto-generated constructor stub
		callbackReference=cbh;
	}
	void go(){
		callbackReference.increment();
	}
}
