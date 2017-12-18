package chapter17.nine;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class SpringDetector {

	public static <T extends Groundhog> void detectSpring(Class<T> type) throws Exception, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Constructor<T> ghog=type.getConstructor(int.class);  //含有int参数的构造函数
		Map<Groundhog, Prediction> map=new HashMap<Groundhog, Prediction>();
		for (int i = 0; i < 10; i++) {
			map.put(ghog.newInstance(i), new Prediction());
		}
		System.out.println("map="+map);
		Groundhog gh=ghog.newInstance(3);
		System.out.println("Looking up prediction for "+gh);
		if(map.containsKey(gh)){  //map是根据对象生成的hascode地址判断对象是否相同的，
			//如果想让对象作为map的键，来判断对象是否相同。那么对象应该覆盖hashcode和equals方法。生成对象自己的hashcode吗。
			//例如按照对象包含的int属性生成hashcode 吗等。HashMap使用equals判断当前的键是否与表中存在的键相同。所以要覆盖equals方法
			System.out.println(map.get(gh));
		}else{
			System.out.println("Key not found"+gh);
		}
	}
	public static void main(String[] args) {
		try {
			detectSpring(Groundhog.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
