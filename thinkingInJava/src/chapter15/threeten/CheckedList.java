package chapter15.threeten;

import java.util.ArrayList;
import java.util.List;

import chapter11.three.Dog;
import chapter15.eleven.Cat;

public class CheckedList {

	static void oldStyleMethod(List probablyDogs){
		probablyDogs.add(new Cat());
	}
	public static void main(String[] args) {
		System.out.println("entry");
		List<Dog> dogs1=new ArrayList<Dog>();
		oldStyleMethod(dogs1);
	}
	
}
