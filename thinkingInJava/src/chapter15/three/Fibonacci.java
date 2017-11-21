package chapter15.three;

public class Fibonacci implements Generator<Integer>{

	private int count=0;
	public Integer next() {
		// TODO Auto-generated method stub
		return fin(count++);
	}
	private Integer fin(int i) {
		// TODO Auto-generated method stub
		if(i<2)
			return 1;
		return fin(i-1)+fin(i-2);
	}
	public static void main(String[] args) {
		Fibonacci gen=new Fibonacci();
		for (int i = 0; i < 18; i++) {
			System.out.println(gen.next()+" ");
		}
	}
}
