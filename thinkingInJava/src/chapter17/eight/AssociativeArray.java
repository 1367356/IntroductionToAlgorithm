package chapter17.eight;

import java.util.HashMap;

public class AssociativeArray<K,V>{

	private Object[][] pairs;  //�Զ�ά����ģ��map��������map���᲻�ɱ䳤�ȡ�ʵ���õ����ڲ���ڵ�Node<K,V>
	private int index;
	public AssociativeArray(int length) {  //����Ҫ����map�ĳ��ȡ�
		// TODO Auto-generated constructor stub
		pairs=new Object[length][2];  //����Ϊ2 [][0]Ϊ����[][1]Ϊֵ
	}
	
	//ģ��map��put����
	public void put(K key,V value){
		if(index>=pairs.length){
			throw new ArrayIndexOutOfBoundsException();
		}
		pairs[index++]=new Object[]{key,value};
	}
	
	//ģ��map��get����
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
			
			if(i<index-1)  //û�����һ��֮ǰ�����ӻ��з�
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