package chapter15.three;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class IterableFibonacci extends Fibonacci implements Iterable<Integer>{

	private int n;
	public IterableFibonacci(int count) {
		// TODO Auto-generated constructor stub
		n=count;
	}
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return  new Iterator<Integer>() {

			public boolean hasNext() {
				// TODO Auto-generated method stub
				return n>0;
			}

			public Integer next() {
				// TODO Auto-generated method stub
				n--;
				return IterableFibonacci.this.next();
			}

			public void remove() {
				// TODO Auto-generated method stub
				throw new UnsupportedOperationException();
			}

			public void forEachRemaining(Consumer<? super Integer> action) {
				// TODO Auto-generated method stub
				
			}
		};
	}

	public void forEach(Consumer<? super Integer> action) {
		// TODO Auto-generated method stub
		
	}

	public Spliterator<Integer> spliterator() {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args) {
		for(int i:new IterableFibonacci(18))
			System.out.println(i+"");
	}

}
