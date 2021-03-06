package chapter15.five;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

import chapter15.four.Generators;

public class BankTeller {

	public static void serve(Teller t,Customer c){
		System.out.println(t+"serves"+c);
	}
	public static void main(String[] args) {
		Random rand=new Random(47);
		Queue<Customer> line=new LinkedList<Customer>();
		Generators.fill(line, Customer.generator(), 15);
		ArrayList<Teller> tellers=new ArrayList<Teller>();
		Generators.fill(tellers, Teller.generator(), 4);
		for(Customer c:line)
			serve(tellers.get(rand.nextInt(tellers.size())), c);
	}
}
