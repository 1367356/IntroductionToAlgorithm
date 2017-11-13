package chapter10.eight;

/**
 * 执行回调的对象
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
