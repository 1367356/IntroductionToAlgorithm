package chapter10.eight;

/**
 * �����ڲ������
 * @author admin
 *
 */
public class Callee2 extends MyIncrement{

	private int i=0;
	public void increment() {   //�������Ѿ�����increment
		super.increment();
		i++;
		System.out.println(i);
	}
	private class Closure implements Incrementable{

		public void increment() {   //Ҳ��Ҫʵ��Incrementable��increment����������ʹ���ڲ���ȥʵ�֡�
			// TODO Auto-generated method stub
			Callee2.this.increment();
		}
	}
	Incrementable getCallbackReference(){
		return new Closure();
	}
}
