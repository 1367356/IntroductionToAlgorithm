package chapter15.seventeen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import chapter15.three.Coffee;
import chapter15.three.Generator;
import chapter15.three.Latte;
import chapter15.three.Mocha;

public class Fill2 {

	public static <T> void fill(Addable<T> addable,Class<? extends T> classToken,int size){
		for (int i = 0; i < size; i++) {
			try {
				addable.add(classToken.newInstance());
			} catch (Exception e) {
				System.out.println(e);
		}
		}
		
	}
	public static <T> void fill(Addable<T> addable,Generator<T> generator,int size){
		for (int i = 0; i <size; i++) {
			addable.add(generator.next());
		}
	}
}

/**
 * 适配一个基类型Addable，需要使用composition（作文，作曲; 创作; 构图，布置; 妥协，和解;）
 * @author admin
 *
 * @param <T>
 */
class AddableCollectionAdapter<T> implements Addable<T>{

	private Collection<T> c;
	public AddableCollectionAdapter(Collection<T> c) {
		// TODO Auto-generated constructor stub
		this.c=c;
	}
	public void add(T t) {
		// TODO Auto-generated method stub
		c.add(t);
	}
	
}
class Adapter{
	public static <T> Addable<T> collectionAdapter(Collection<T> c){
		return new AddableCollectionAdapter<T>(c);
	}
}

class AddableSimpleQueue<T> extends AddableCollectionAdapter<T> implements Addable<T>{

	public AddableSimpleQueue(Collection<T> c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	public void add(T item){
		super.add(item);
	}
}









