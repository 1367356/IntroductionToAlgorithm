package chapter15.four;

import java.util.HashSet;
import java.util.Set;

public class Sets {

	/**
	 * 求两个集合的合并
	 * @param a
	 * @param b
	 * @return
	 */
	public static <T> Set<T> union(Set<T> a,Set<T> b){
		Set<T> result=new HashSet<T>(a);
		result.addAll(b);
		return result;
	}
	/**
	 * 求两个集合共有的部分
	 * @param a
	 * @param b
	 * @return
	 */
	public static <T> Set<T> intersection(Set<T> a,Set<T> b){
		Set<T> result=new HashSet<T>(a);
		result.retainAll(b);
		return result;
	}
	/**
	 * 求两个集合的差
	 * @param superset
	 * @param subset
	 * @return
	 */
	public static <T> Set<T> difference(Set<T> superset,Set<T> subset){
		Set<T> result=new HashSet<T>(superset);
		result.removeAll(subset);
		return result;
	}
	/**
	 * 求两个集合的包含交集之外的元素
	 * @param a
	 * @param b
	 * @return
	 */
	public static <T> Set<T> complement(Set<T> a,Set<T> b){
		return difference(union(a, b), intersection(a, b));
	}
}
