package chapter14.two.copy;

public class ClassCasts {

	public static void main(String[] args) {
		Building b=new House();
		Class<House> houseType=House.class;
		House h=houseType.cast(b);
		h=(House)b;
	}
}

class Building{}
class House extends Building{
}