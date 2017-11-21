package chapter15.four;

import java.util.ArrayList;
import java.util.Collection;

import chapter15.three.Coffee;
import chapter15.three.CoffeeGenerator;
import chapter15.three.Fibonacci;
import chapter15.three.Generator;

/**
 * ���÷��Ͳ�������������
 * @author admin
 *
 */
public class Generators {
	
	/**
	 * ����һ�����
	 * @param coll ��Ŷ���Ľ��
	 * @param gen  ����������
	 * @param n  ���ɶ���ĸ���
	 * @return  װ�ж���ļ��ϡ�
	 */
	public static <T> Collection<T> fill(Collection<T> coll,Generator<T> gen,int n){
		for (int i = 0; i < n; i++) {
			coll.add(gen.next());
		}
		return coll;
	}
	public static void main(String[] args) {
		Collection<Coffee> coffee=fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 10);
		for(Coffee c:coffee)
			System.out.println(c);
		Collection<Integer> fnumbers=fill(new ArrayList<Integer>(),new Fibonacci(),12);
		for(int i:fnumbers)
			System.out.println(i+",");
	}
}