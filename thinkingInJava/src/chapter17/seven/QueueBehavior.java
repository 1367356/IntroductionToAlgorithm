package chapter17.seven;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.PriorityBlockingQueue;

import chapter15.three.Generator;

public class QueueBehavior {

	private static int count=10;
	static <T> void test(Queue<T> queue,Generator<T> gen){
		for (int i = 0; i < count; i++) {
			queue.offer(gen.next());
		}
		while(queue.peek()!=null){
			System.out.print(queue.remove()+" ");
		}
		System.out.println();
	}
	static class Gen implements Generator<String>{

		String[] s=("A B C D E E  F F FD DG D  DS D D  F").split(" ");
		int i;  //��ʼĬ��ֵΪ0
		public String next() {
			// TODO Auto-generated method stub
			return s[i++];
		}
	}
	public static void main(String[] args) {
		test(new LinkedList<String>(),new Gen());
		test(new PriorityQueue<String>(),new Gen());
		test(new ArrayBlockingQueue<String>(count),new Gen());
		test(new ConcurrentLinkedQueue<String>(),new Gen());
		test(new LinkedBlockingDeque<String>(),new Gen());
		test(new PriorityBlockingQueue<String>(),new Gen());
	}
}
