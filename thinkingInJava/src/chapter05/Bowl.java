package chapter05;

public class Bowl {
	int k=6;
	public Bowl(){
		
	}
	public Bowl(int i) {
		System.out.println("i"+i);
	}
	static{
		int j=47;
		System.out.println("j"+j);
	}
	{
		System.out.println("k"+k);
	}
}
