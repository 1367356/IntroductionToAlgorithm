package chapter19.eleven;

import java.util.Random;

public class RoShamBo1 {

	static final int SIZE=20;
	private static Random random=new Random();
	
	public static Item newItem(){
		
		switch (random.nextInt(3)) {
		case 0:
			return new Scissors();
		case 2:
			return new Paper();
		case 1:
			return new Rock();
		default:
		}
		return null;
	}
	
	public static void match(Item a,Item b){
		System.out.println(a+"vs."+b+":"+a.compete(b));
	}
	public static void main(String[] args) {
		for (int i = 0; i < SIZE; i++) {
			match(newItem(),newItem());
		}
	}
}
