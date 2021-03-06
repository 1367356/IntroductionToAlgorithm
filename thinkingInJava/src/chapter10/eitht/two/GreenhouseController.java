package chapter10.eitht.two;

import chapter10.eitht.two.GreenhouseControls.Terminate;

public class GreenhouseController {

	public static void main(String[] args) {
		GreenhouseControls gc=new GreenhouseControls();
		gc.addEvent(gc.new Bell(900));//通过gc创建内部类对象
		Event[] eventList={
				gc.new ThermostatNight(0),
				gc.new LightOn(200),
				gc.new lightOff(400),
				gc.new WaterOn(600),
				gc.new WaterOff(800),
				gc.new ThermostatDay(1400)
				};
		    gc.addEvent(gc.new Restart(2000, eventList));
			gc.addEvent(new GreenhouseControls.Terminate(10));
			gc.run();

	}
}
