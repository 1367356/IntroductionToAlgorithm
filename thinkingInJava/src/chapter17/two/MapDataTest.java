package chapter17.two;

public class MapDataTest {

	public static void main(String[] args) {
		//Pair Generator;
		System.out.println(MapData.map(new Letters(), 11));
		
		//An Iterable and a single value;
		System.out.println(MapData.map(new Letters(), "Pop"));
	}
	
}
