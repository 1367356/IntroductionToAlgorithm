package chapter17.two;

import chapter15.three.Generator;

public class Goverment implements Generator<String>{

	String[] foundation=("strange women lying in ponds, no bsis").split(" ");
	private int index=0;
	public String next() {
		// TODO Auto-generated method stub
		return foundation[index++];
	}
	
}