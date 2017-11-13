package chapter10.six;

public class Factories {

	public static void serviceConsumer(ServiceFactory fact){
		Service1 s = fact.getService();
		s.method1();
		s.method2();
	}
	public static void main(String[] args) {
		serviceConsumer(Implementation.factory);
		serviceConsumer(Implementation2.serviceFactory);
	}
}