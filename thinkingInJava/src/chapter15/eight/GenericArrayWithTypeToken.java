package chapter15.eight;

import java.lang.reflect.Array;
import java.util.Arrays;

public class GenericArrayWithTypeToken<T> {

	private T[] array;
	@SuppressWarnings("unchecked")
	public GenericArrayWithTypeToken(Class<T> type,int sz) {
		// TODO Auto-generated constructor stub
		array=(T[]) Array.newInstance(type, sz);
	}
	public void put(int index,T item) {
		array[index]=item;
	}
	public T get(int index) {
		return array[index];
	}
	public T[] rep() {
		return array;
	}
	public static void main(String[] args) {
		GenericArrayWithTypeToken<Integer> gai=new GenericArrayWithTypeToken<Integer>(Integer.class, 10);
		Integer[] iarr=gai.rep();
	}
}
