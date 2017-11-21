package chapter14.three.copy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class PetCreator {

	private Random rand=new Random(47);
	//����һ�����飬���Pet��֮�����
	public abstract List<Class<? extends Pet>> types();//���󷽷�
	
	/**
	 * �������pet��һ�������
	 * @return
	 */
	public Pet randomPet(){
		int n=rand.nextInt(types().size());
		try {
			return types().get(n).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public Pet[] createArray(int size){
		Pet[] result=new Pet[size];
		for (int i = 0; i < result.length; i++) {
			result[i]=randomPet();
		}
		return result;
	}
	public ArrayList<Pet> arrayList(int size){
		List<Pet> list=new ArrayList<Pet>();
		for (int i = 0; i < size; i++) {
			list.add(randomPet());
		}
		return (ArrayList<Pet>) list;
	}
}