package chapter17.two;

import java.util.ArrayList;

import chapter15.three.Generator;

//将Generator和数值作为构造器产数，可以直接生产带有内容的容器
public class CollectionData<T> extends ArrayList<T> {

	public CollectionData(Generator<T> gen,int quantity) {
		// TODO Auto-generated constructor stub
		for (int i = 0; i < quantity; i++) {
			add(gen.next());
		}
	}
	public static <T> CollectionData<T> list(Generator<T> gen,int quantity){
		return new CollectionData<T>(gen, quantity);
	}
}
