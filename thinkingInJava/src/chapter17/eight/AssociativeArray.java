package chapter17.eight;

import java.util.HashMap;

public class AssociativeArray<K,V>{

	private Object[][] pairs;  //以二维数组模仿map，创建的map将会不可变长度。实际用的是内部类节点Node<K,V>
	private int index;
	public AssociativeArray(int length) {  //传入要创建map的长度。
		// TODO Auto-generated constructor stub
		pairs=new Object[length][2];  //列数为2 [][0]为键，[][1]为值
	}
	
	//模仿map的put方法
	public void put(K key,V value){
		if(index>=pairs.length){
			throw new ArrayIndexOutOfBoundsException();
		}
		pairs[index++]=new Object[]{key,value};
	}
	
	//模仿map的get方法
	public V get(K key){
		for (int i = 0; i < index; i++) {
			if(key==pairs[i][0]){
				return (V) pairs[i][1];
			}
		}
		return null;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder result=new StringBuilder();
		for (int i = 0; i < index; i++) {
			result.append(pairs[i][0].toString());
			result.append(" ");
			result.append(pairs[i][1].toString());
			
			if(i<index-1)  //没到最后一行之前，添加换行符
				result.append("\n");
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		AssociativeArray<String, String> map=new AssociativeArray<String, String>(3);
		map.put("sky", "blue");
		map.put("grass", "green");
		map.put("ocean", "dancing");
		try {
			map.put("out of index", "exception");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("too many Objects");
		}
		System.out.println(map);
		System.out.println(map.get("sky"));
	}
}
