package chapter07;

public class Insect {

	{
		System.out.println("Insert constructor coding area");
	}
	private int i=9;
	protected int j;
	Insect() {
		System.out.println("i"+i+",j"+j);  //���j��0���ò��������j=39��Ĭ����0
		j=39;
	}
	private static int x1=printInit("static insect.x1 initialized");
	static{
		System.out.println("Insect static coding area");
	}
	static int printInit(String string) {
		// TODO Auto-generated method stub
		System.out.println(string);
		return 47;
	}
}
