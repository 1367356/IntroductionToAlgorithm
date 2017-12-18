package chapter17.nine;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class SlowMap<K,V> extends AbstractMap<K, V> {
	
	private List<K> keys=new ArrayList<K>();
	private List<V> values=new ArrayList<V>();
	
	public V put(K key,V value){
		V oldValue=get(key);
		if(!keys.contains(key)){
			keys.add(key);
			values.add(value);
		}else{
			values.set(keys.indexOf(key), value);
			}
		return oldValue;
	}

	public V get(Object key){
		if(!keys.contains(key)){
			return null;
		}else{
			return values.get(keys.indexOf(key));
		}
	}
	
	public V getOrDefault(Object key, V defaultValue) {
		// TODO Auto-generated method stub
		return null;
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

	@Override
	public Set<java.util.Map.Entry<K, V>> entrySet() {
		// TODO Auto-generated method stub
		Set<Map.Entry<K, V>> set=new HashSet<Map.Entry<K,V>>();
		Iterator<K> ki=keys.iterator();
		Iterator<V> vi=values.iterator();
		while(ki.hasNext()){
			set.add(new MapEntry<K,V>(ki.next(),vi.next()));
		}
		return set;
	}
	public static void main(String[] args) {
		SlowMap<String, String> m=new SlowMap<String, String>();
		m.put("a", "v");
		System.out.println(m);
		System.out.println(m.get("BULGARIA"));
		System.out.println(m.entrySet());
	}

}
