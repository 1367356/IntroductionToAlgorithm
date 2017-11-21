package chapter14.three.copy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LiteralPetCreator extends PetCreator{

	public static final List<Class<? extends Pet>> allTypes=Collections.unmodifiableList(Arrays.asList(Pet.class,Dog.class));
	public static final List<Class<? extends Pet>> types=allTypes.subList(allTypes.indexOf(Dog.class), allTypes.size());
	public List<Class<? extends Pet>> types() {
		// TODO Auto-generated method stub
		return types;
	}
	public static void main(String[] args) {
		System.out.println(types);
	}

}
