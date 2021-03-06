package chapter15.five;

import chapter15.three.Generator;

public class Customer {

	private static long counter=1;
	private final long id=counter++;
	/**
	 * 构造函数设置为私有的，不能创建对象。迫使Customer调用静态方法generator生成Generator对象
	 */
	private Customer() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Customer"+id;
	}
	public static Generator<Customer> generator(){
		return new Generator<Customer>() {

			public Customer next() {
				// TODO Auto-generated method stub
				return new Customer();
			}
		};
	}
}

class Teller{
	private static long counter=1;
	private static long id=counter++;
	public Teller() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Teller"+id;
	}
	public static Generator<Teller> generator(){
		return new Generator<Teller>() {

			public Teller next() {
				// TODO Auto-generated method stub
				return new Teller();
			}
		};
	}
}