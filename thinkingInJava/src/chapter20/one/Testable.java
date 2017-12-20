package chapter20.one;


public class Testable {

	public void execute(){
		System.out.println("Executing");
	}
	
	@Test
	void testExecute(){
		execute();
	}
}
