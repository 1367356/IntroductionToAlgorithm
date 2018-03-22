package chapter20.two;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import chapter20.one.PasswordUtils;
import chapter20.one.UseCase;

/**
 * ע�⴦����
 * @author admin
 *
 */
public class UseCaseTracker {

	public static void trackUseCases(List<Integer> useCases,Class<?> cl){
		for(Method m:cl.getDeclaredMethods()){
			UseCase uc=m.getAnnotation(UseCase.class);  //����PasswordUtils�еķ�������ȡע�����UseCase
			if(uc!=null){
				System.out.println("found use case"+uc.id());//��ȡ��Ӧ��
			}
			useCases.remove(new Integer(uc.id()));
		}
		for(int i:useCases){
			System.out.println("Warning :Missing use case -"+i);
		}
	}
	public static void main(String[] args) {
		List<Integer> useCases=new ArrayList<Integer>();
		Collections.addAll(useCases, 47,48,49,50);
		trackUseCases(useCases, PasswordUtils.class);
	}
	
	
}