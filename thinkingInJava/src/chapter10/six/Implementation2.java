package chapter10.six;

public class Implementation2 implements Service1{

	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("implemantation2 mehtod1");
	}

	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("implemantation2 method2");
	}
    public static ServiceFactory serviceFactory=new ServiceFactory() {
		
		public Service1 getService() {
			// TODO Auto-generated method stub
			return new Implementation2();
		}
	};
	
}
