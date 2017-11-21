package chapter15.one;

public class TupleTest {

	static TwoTuple<String,Integer> f(){
		return new TwoTuple<String, Integer>("TwoTuple", 2);
	}
	static ThreeTuple<Character, String, Integer> g(){
		return new ThreeTuple<Character, String, Integer>('c', "ThreeTuple", 3);
	}
	public static void main(String[] args) {
		TwoTuple<String, Integer> ttsi=f();
		System.out.println(ttsi);
		System.out.println(g());
	}
}
