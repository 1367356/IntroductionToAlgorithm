package chapter16.six;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import chapter15.three.Generator;

public class FillingArrays {

	public static void main(String[] args) {
		int size=6;
		boolean[] a1=new boolean[size];
		byte[] a2=new byte[size];
		char[] a3=new char[size];
		ArrayList  list=new ArrayList();
		Arrays.fill(a1, true);
		Arrays.fill(a2, (byte)11);
		Arrays.fill(a3, 'x');
		Array a;
	}
}
