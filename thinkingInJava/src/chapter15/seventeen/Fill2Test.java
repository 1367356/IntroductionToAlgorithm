package chapter15.seventeen;

import java.util.ArrayList;
import java.util.List;

import chapter15.three.Coffee;
import chapter15.three.Latte;
import chapter15.three.Mocha;

public class Fill2Test{
	public static void main(String[] args) {
		List<Coffee> carrier=new ArrayList<Coffee>();
		Fill2.fill(new AddableCollectionAdapter<Coffee>(carrier), Coffee.class, 3);
		Fill2.fill(Adapter.collectionAdapter(carrier), Latte.class, 3);
		for(Coffee c:carrier){
			System.out.println(c);
		}
		System.out.println("____________________-");
		AddableSimpleQueue<Coffee> coffeeQueue=new AddableSimpleQueue<Coffee>(carrier);
		Fill2.fill(coffeeQueue, Mocha.class, 4);
		Fill2.fill(coffeeQueue, Latte.class, 1);
//		for(Coffee c:coffeeQueue){
//			System.out.println(c);
//		}
	}
}
