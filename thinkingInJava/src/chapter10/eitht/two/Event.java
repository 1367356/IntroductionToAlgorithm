package chapter10.eitht.two;

/**
 * 由于默认的行为是基于时间去控制的 ，使用抽象类代替接口，描述要控制的事件，
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
	public abstract void action();  //具体的动作方法
}
