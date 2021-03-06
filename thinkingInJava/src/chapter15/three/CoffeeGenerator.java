package chapter15.three;

import java.util.Iterator;
import java.util.Random;
import java.util.Spliterator;
import java.util.function.Consumer;

public class CoffeeGenerator implements Generator<Coffee>,Iterable<Coffee>{

	private Class[] types={Latte.class,Mocha.class,Cappuccino.class,Americano.class,Breve.class};
	private static Random rand=new Random(47);
	public CoffeeGenerator() {
		// TODO Auto-generated constructor stub
	}
	private int size=0;
	public CoffeeGenerator(int sz){
		size=sz;
	}
	public Iterator<Coffee> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public void forEach(Consumer<? super Coffee> action) {
		// TODO Auto-generated method stub
		
	}

	public Spliterator<Coffee> spliterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public Coffee next() {
		// TODO Auto-generated method stub
		try {
			return (Coffee) types[rand.nextInt(types.length)].newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	class CoffeeIterator implements Iterator<Coffee>{
		int count=size;
		public boolean hasNext() {
			return count>0;
		}
		public Coffee next() {
			// TODO Auto-generated method stub
			count--;
			return CoffeeGenerator.this.next();
		}
		public void remove() {
			// TODO Auto-generated method stub
			throw new UnsupportedOperationException();
		}
		public void forEachRemaining(Consumer<? super Coffee> action) {
			// TODO Auto-generated method stub
			
		}
		public Iterator<Coffee> iterator(){
			return new CoffeeIterator();
		}

	}
	public static void main(String[] args) {
		CoffeeGenerator gen=new CoffeeGenerator();
		for (int i = 0; i < 5; i++) {
			System.out.println(gen.next());
		}
		for(Coffee c:new CoffeeGenerator(5))
			System.out.println(c);
	}

	
}
