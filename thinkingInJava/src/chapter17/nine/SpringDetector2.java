package chapter17.nine;

import java.lang.reflect.InvocationTargetException;

public class SpringDetector2 {

	public static void main(String[] args) {
		try {
			SpringDetector.detectSpring(Groundhog2.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
