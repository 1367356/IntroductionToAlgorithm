package chapter15.eight;

public class InstantiateGenericType {

	public static void main(String[] args) {
		try {
			ClassAsFactory<Employee> fe=new ClassAsFactory<Employee>(Employee.class);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("ClassAsFactory<Employee> succeed");
		try {
			ClassAsFactory<Integer> fi=new ClassAsFactory<Integer>(Integer.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("ClassAsFactory<Integer> Failed");
		}
		
	}
}
