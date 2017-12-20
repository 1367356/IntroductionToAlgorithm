package chapter19.four;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

public class Reflection {

	public static Set<String> analyze(Class<?> enumClass){
		System.out.println("--------Analyzing--"+enumClass+"");
		System.out.println("Interfaces");
		for(Type t:enumClass.getGenericInterfaces()){
			System.out.println(t);
		}
		System.out.println("Methods");
		Set<String> methods=new TreeSet<String>();
		for(Method m:enumClass.getMethods()){
			methods.add(m.getName());
		}
		System.out.println(methods);
		return methods;
	}
	
	public static void main(String[] args) {
		Set<String> exploreMethods=analyze(Explore.class);
		Set<String> EnumMethods=analyze(Enum.class);
		System.out.println("Explore.containsAll(Enum)?" + exploreMethods.containsAll(EnumMethods));
	}
}
