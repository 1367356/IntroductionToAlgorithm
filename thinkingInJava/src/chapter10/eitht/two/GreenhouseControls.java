package chapter10.eitht.two;

/**
 * 控制器子类，在框架中执行
 * @author admin
 *
 */
public class GreenhouseControls extends Controller {

	private boolean light=false;  //定义一个开关
	/**
	 * 内部类，继承Event，执行具体的事件，
	 * @author admin
	 *
	 */
	public class LightOn extends Event{
		public LightOn(long delayTime) {
			super(delayTime);
		}
		public void action() {
			light=true;  //开关打开
		}
		public String toString() {
			return "Light is on";
		}
	}
	
	/**
	 * 
	 * @author admin
	 *
	 */
	public class lightOff extends Event{

		public lightOff(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			light=false;
		}
		public String toString() {
			return "Light is off";
		}
	}
	
	/**
	 * 与上面相同
	 */
	private boolean water=false;  
	public class WaterOn extends Event{

		public WaterOn(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			water=true;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Greenhouse water is on";
		}
	}
	public class WaterOff extends Event{

		public WaterOff(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			water=false;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Greenhouse water is off";
		}
		
	}
	////////////////////////////////////////////////
	private String thermostat="Day";
	public class ThermostatNight extends Event{

		public ThermostatNight(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			thermostat="Night";
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Thermostat on night setting";
		}
		
	}
	public class ThermostatDay extends Event{

		public ThermostatDay(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			thermostat="Day";
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Thermostat on day setting";
		}
	}
	
	public class Bell extends Event{

		public Bell(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			addEvent(new Bell(delayTime));
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Bing!";
		}
	}
	
	public class Restart extends Event{
		private Event[] eventList;
		public Restart(long delayTime,Event[] eventList) {
			super(delayTime);
			// TODO Auto-generated constructor stub
			this.eventList=eventList;
			for(Event e:eventList){
				addEvent(e);
			}
		}

		@Override
		public void action() {
			for(Event e:eventList){
				e.start();
				addEvent(e);
			}
			start();
			addEvent(this);  //this是Restart,Restart是Event的子类。
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Restarting system";
		}
	}
	public static class Terminate extends Event{

		public Terminate(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			System.exit(0);
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Terminati";
		}
		
	}
	
}
