package chapter11.two;

import chapter14.FancyToy;

public class GenericToyTest {

	public static void main(String[] args) {
		Class<FancyToy> ftclass=FancyToy.class;
		
		try {
			FancyToy fancyToy=ftclass.newInstance();
			Class<? super FancyToy> up=ftclass.getSuperclass();
			Object obj=up.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
