package chapter17.two;

import java.util.LinkedHashMap;

import chapter15.three.Generator;

/**
 * Map使用生成器填充对象数据
 * @author admin
 *
 * @param <K>
 * @param <V>
 */
public class MapData<K,V> extends LinkedHashMap<K, V>{

	public MapData(Generator<Pair<K, V>> gen,int quantity) {
		// TODO Auto-generated constructor stub
		for (int i = 0; i < quantity; i++) {
			Pair<K, V> p=gen.next();
			put(p.key,p.value);
		}
	}
	
	public MapData(Generator<K> genK,Generator<V> genV,int quantity) {
		// TODO Auto-generated constructor stub
		for (int i = 0; i < quantity; i++) {
			put(genK.next(),genV.next());
		}
	}
	
	//A key Generator and a single value
	public MapData(Generator<K> genK,V value,int quantity) {
		// TODO Auto-generated constructor stub
		for (int i = 0; i < quantity; i++) {
			put(genK.next(),value);
		}
		
	}	
	//An Iterable and a value Generator;
	public MapData(Iterable<K> genK,Generator<V> genV) {
		// TODO Auto-generated constructor stub
		for(K key:genK){
			put(key,genV.next());
		}
	}
	
	//An Iterable and a single value;
	public MapData(Iterable<K> genK,V value) {
		// TODO Auto-generated constructor stub
		for(K key:genK){
			put(key,value);
		}
	}
	
	//Generic convenience methods
	public static <K,V> MapData<K, V> map(Generator<Pair<K, V>> gen,int quantity){
		return new MapData<K, V>(gen,quantity);
	}
	
	public static <K,V> MapData<K, V> map(Generator<K> genK,V value,int quantity){
		return new MapData<K, V>(genK, value, quantity);
	}
	
	public static <K,V> MapData<K, V> map(Generator<K> genK,Generator<V> genV,int quantity){
		return new MapData<K, V>(genK, genV, quantity);
	}
	
	public static <K,V> MapData<K, V> map(Iterable<K> genK,Generator<V> genV){
		return new MapData<K, V>(genK, genV);
	}
	
	public static <K,V> MapData<K, V> map(Iterable<K> genK,V value){
		return new MapData<K, V>(genK, value);
	}
}
