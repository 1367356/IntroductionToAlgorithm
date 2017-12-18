package chapter17.nine;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class SpringDetector {

	public static <T extends Groundhog> void detectSpring(Class<T> type) throws Exception, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Constructor<T> ghog=type.getConstructor(int.class);  //����int�����Ĺ��캯��
		Map<Groundhog, Prediction> map=new HashMap<Groundhog, Prediction>();
		for (int i = 0; i < 10; i++) {
			map.put(ghog.newInstance(i), new Prediction());
		}
		System.out.println("map="+map);
		Groundhog gh=ghog.newInstance(3);
		System.out.println("Looking up prediction for "+gh);
		if(map.containsKey(gh)){  //map�Ǹ��ݶ������ɵ�hascode��ַ�ж϶����Ƿ���ͬ�ģ�
			//������ö�����Ϊmap�ļ������ж϶����Ƿ���ͬ����ô����Ӧ�ø���hashcode��equals���������ɶ����Լ���hashcode��
			//���簴�ն��������int��������hashcode ��ȡ�HashMapʹ��equals�жϵ�ǰ�ļ��Ƿ�����д��ڵļ���ͬ������Ҫ����equals����
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
