package chapter19.three;

public class TrafficLight {

	Singal color=Singal.RED;
	public void change(){
		switch (color) {
		case RED:
			color=Singal.GREEN;
			break;
		case GREEN:
			color=Singal.YELLOW;
			break;

		default:
			color=Singal.RED;
			break;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The traffic light is"+color;
	}
	public static void main(String[] args) {
		TrafficLight tl=new TrafficLight();
		for (int i = 0; i < 8; i++) {
			System.out.println(tl);
			tl.change();
		}
	}
}
