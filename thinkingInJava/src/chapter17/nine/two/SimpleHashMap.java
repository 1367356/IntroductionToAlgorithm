package chapter17.nine.two;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

import chapter17.nine.MapEntry;

/**
 * 实现一个简单的hashMap
 * @author admin
 *
 * @param <K>
 * @param <V>
 */
public class SimpleHashMap<K, V> extends AbstractMap<K, V>{

	private static final int SIZE=997;
	LinkedList<MapEntry<K, V>>[] buckets=new LinkedList[SIZE];
	
	//向创建的HashMap中添加元素
	public V put(K key,V value){
		V oldValue=null;
		int index=Math.abs(key.hashCode())%SIZE;
		if(buckets[index]==null){
			buckets[index]=new LinkedList<MapEntry<K,V>>();
		}
		LinkedList<MapEntry<K, V>> bucket=buckets[index];
		MapEntry<K, V> pair=new MapEntry<K,V>(key, value);
		boolean found=false;
		
		//将linkedList转化为迭代器
		ListIterator<MapEntry<K, V>> it=bucket.listIterator();
		while(it.hasNext()){
			MapEntry<K, V> iPair=it.next();
			if(iPair.getKey().equals(key)){
				oldValue=iPair.getValue();
				it.set(iPair);
				found=true;
				break;
			}
		}
		if(!found){
			buckets[index].add(pair);
		}
		return oldValue;
	}
	
	public V get(Object key){
		int index=Math.abs(key.hashCode())%SIZE;
		if(buckets[index]==null){
			return null;
		}
		for(MapEntry<K, V> iPair:buckets[index]){
			if(iPair.getKey().equals(key)){
				return iPair.getValue();
			}
		}
		return null;
	}

	//返回一个Map.Entry对象即。
	@Override
	public Set<java.util.Map.Entry<K, V>> entrySet() {
		// TODO Auto-generated method stub
		Set<Map.Entry<K, V>> set=new HashSet<Map.Entry<K,V>>();
		for(LinkedList<MapEntry<K, V>> bucket:buckets){
			if(bucket==null)
				continue;
			for(MapEntry<K, V> mPair:bucket){
				set.add(mPair);
			}
		}
		return set;
	}
	
	public static void main(String[] args) {
		SimpleHashMap<String, String> m=new SimpleHashMap<String, String>();
		m.put("haah", "dga");
		System.out.println(m);
	}
	public void forEach(BiConsumer<? super K, ? super V> action) {
		// TODO Auto-generated method stub
		
	}

	public void replaceAll(
			BiFunction<? super K, ? super V, ? extends V> function) {
		// TODO Auto-generated method stub
		
	}

	public V putIfAbsent(K key, V value) {
		// TODO Auto-generated method stub
		return null;
	}
	//这些抽象方法是在abstractMap的父类中，AbstractMap没有实现
	public V getOrDefault(Object key, V defaultValue) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean remove(Object key, Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean replace(K key, V oldValue, V newValue) {
		// TODO Auto-generated method stub
		return false;
	}

	public V replace(K key, V value) {
		// TODO Auto-generated method stub
		return null;
	}

	public V computeIfAbsent(K key,
			Function<? super K, ? extends V> mappingFunction) {
		// TODO Auto-generated method stub
		return null;
	}

	public V computeIfPresent(K key,
			BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
		// TODO Auto-generated method stub
		return null;
	}

	public V compute(K key,
			BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
		// TODO Auto-generated method stub
		return null;
	}

	public V merge(K key, V value,
			BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
		// TODO Auto-generated method stub
		return null;
	}



}
