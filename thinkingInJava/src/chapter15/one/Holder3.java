package chapter15.one;

/**
 * 泛型T就是创建对象时指定的类型，指定之后就只能存储这种类型
 * @author admin
 *
 * @param <T>
 */
public class Holder3<T> {  

	private T a;
	public Holder3(T a){
		this.a=a;
	}
	public T getA() {
		return a;
	}
	public void setA(T a) {
		this.a = a;
	}
	public static void main(String[] args) {
		Holder3<Automobile> h3=new Holder3<Automobile>(new Automobile());
		Automobile a=h3.getA();//不用强制类型转换
		
		//h3.setA("s");//出现错误，只能存储指定的Automobile
	}
	
}
