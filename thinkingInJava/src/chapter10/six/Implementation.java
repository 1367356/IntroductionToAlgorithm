package chapter10.six;

public class Implementation implements Service1 {

	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("implemetation1 method1");
	}

	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("implementation method2");
	}
	public static ServiceFactory factory=new ServiceFactory() {
		
		public Service1 getService() {
			// TODO Auto-generated method stub
			return new Implementation();
		}
	};

}
