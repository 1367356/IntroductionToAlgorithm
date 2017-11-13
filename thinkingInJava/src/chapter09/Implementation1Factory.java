package chapter09;

public class Implementation1Factory implements ServiceFactory{

	public Service getService() {
		return new Implementation1();
	}

}
