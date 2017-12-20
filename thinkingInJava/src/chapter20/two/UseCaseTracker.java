package chapter20.two;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import chapter20.one.PasswordUtils;
import chapter20.one.UseCase;

/**
 * 注解处理器
 * @author admin
 *
 */
public class UseCaseTracker {

	public static void trackUseCases(List<Integer> useCases,Class<?> cl){
		for(Method m:cl.getDeclaredMethods()){
			UseCase uc=m.getAnnotation(UseCase.class);  //根据PasswordUtils中的方法，获取注解对象UseCase
			if(uc!=null){
				System.out.println("found use case"+uc.id());//获取相应的
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
