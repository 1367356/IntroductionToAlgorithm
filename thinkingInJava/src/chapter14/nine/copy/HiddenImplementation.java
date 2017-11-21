package chapter14.nine.copy;
import java.lang.reflect.*;
public class HiddenImplementation {

	public static void main(String[] args) {
		A a=Hiddenc.makeA();
		a.f();
		System.out.println(a.getClass().getName());
		
	}
}
