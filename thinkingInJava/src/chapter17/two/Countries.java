package chapter17.two;

import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
//享元模式
public class Countries {

	//国家与首都的Map
	public static final String[][] DATA={
	//africa
	{"ALGERIA","aLGIERS"},
	{"ANGOLA","luanda"},
	//asia
	{"AFGHANISTAN","Lusaka"},
	{"bahrain","Harare"}
   };
	
	//实现AbstractMap的entrySet方法
	private static class Flyweightmap extends AbstractMap<String, String>{

		private static class Entry implements Map.Entry<String, String>{

			public String getKey() {
				// TODO Auto-generated method stub
				return null;
			}

			public String getValue() {
				// TODO Auto-generated method stub
				return null;
			}

			public String setValue(String value) {
				// TODO Auto-generated method stub
				return null;
			}

			public static <K extends Comparable<? super K>, V> Comparator<java.util.Map.Entry<K, V>> comparingByKey() {
				// TODO Auto-generated method stub
				return null;
			}

			public static <K, V extends Comparable<? super V>> Comparator<java.util.Map.Entry<K, V>> comparingByValue() {
				// TODO Auto-generated method stub
				return null;
			}

			public static <K, V> Comparator<java.util.Map.Entry<K, V>> comparingByKey(
					Comparator<? super K> cmp) {
				// TODO Auto-generated method stub
				return null;
			}

			public static <K, V> Comparator<java.util.Map.Entry<K, V>> comparingByValue(
					Comparator<? super V> cmp) {
				// TODO Auto-generated method stub
				return null;
			}
			
		}
		public String getOrDefault(Object key, String defaultValue) {
			// TODO Auto-generated method stub
			return null;
		}

		public void forEach(BiConsumer<? super String, ? super String> action) {
			// TODO Auto-generated method stub
			
		}

		public void replaceAll(
				BiFunction<? super String, ? super String, ? extends String> function) {
			// TODO Auto-generated method stub
			
		}

		public String putIfAbsent(String key, String value) {
			// TODO Auto-generated method stub
			return null;
		}

		public boolean remove(Object key, Object value) {
			// TODO Auto-generated method stub
			return false;
		}

		public boolean replace(String key, String oldValue, String newValue) {
			// TODO Auto-generated method stub
			return false;
		}

		public String replace(String key, String value) {
			// TODO Auto-generated method stub
			return null;
		}

		public String computeIfAbsent(String key,
				Function<? super String, ? extends String> mappingFunction) {
			// TODO Auto-generated method stub
			return null;
		}

		public String computeIfPresent(
				String key,
				BiFunction<? super String, ? super String, ? extends String> remappingFunction) {
			// TODO Auto-generated method stub
			return null;
		}

		public String compute(
				String key,
				BiFunction<? super String, ? super String, ? extends String> remappingFunction) {
			// TODO Auto-generated method stub
			return null;
		}

		public String merge(
				String key,
				String value,
				BiFunction<? super String, ? super String, ? extends String> remappingFunction) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Set<java.util.Map.Entry<String, String>> entrySet() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
}
