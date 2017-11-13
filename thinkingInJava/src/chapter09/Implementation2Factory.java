package chapter09;

public class Implementation2Factory implements ServiceFactory{

	public Service getService() {
		// TODO Auto-generated method stub
		return new Implementation2();
	}

}
