package chapter10.eitht.two;

/**
 * ����Ĭ�ϵ���Ϊ�ǻ���ʱ��ȥ���Ƶ� ��ʹ�ó��������ӿڣ�����Ҫ���Ƶ��¼���
 * @author admin
 *
 */
public abstract class Event {
	private long eventTime;
	protected final long delayTime;
	public Event(long delayTime) {
		this.delayTime=delayTime;
		start();
	}
	public void start() {
		// TODO Auto-generated method stub
		eventTime=System.nanoTime()+delayTime;
	}
	public boolean ready() {
		return System.nanoTime()>=eventTime;
	}
	public abstract void action();  //����Ķ�������
}