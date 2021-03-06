package chapter11.three;

import java.util.HashMap;
import java.util.Map;

/**
 * 创建一个通用的计数工具。Map的子类
 * @author admin
 *
 */
public class TypeCounter extends HashMap<Class<?>, Integer>{

	private Class<?> baseType;
	public TypeCounter(Class<?> baseType){
		this.baseType=baseType;
	}
	/**
	 * 技术，判断传入的参数类型是否与构造初始化时的类型一致。
	 * @param obj
	 */
	public void count(Object obj) {
		Class<?> type=obj.getClass();
		if(!baseType.isAssignableFrom(type)){
			throw new RuntimeException(obj+"incorrect type"+type+"should be type or subtype of "+baseType);
		}
		countClass(type);
	}
	private void countClass(Class<?> type) {
		// TODO Auto-generated method stub
		Integer quantity=get(type);
		put(type,quantity==null?1:quantity+1);
		Class<?> superClass=type.getSuperclass();
		if(superClass!=null&& baseType.isAssignableFrom(superClass))  //baseType是superClass的子类。递归调用
			countClass(superClass);  //递归调用superClass
	}
	@Override
	public String toString() {
		StringBuilder result=new StringBuilder("{");
		// TODO Auto-generated method stub
		for(Map.Entry<Class<?>, Integer> pair:entrySet()){
			result.append(pair.getKey().getSimpleName());
			result.append("=");
			result.append(pair.getValue());
			result.append(".");
		}
		result.delete(result.length()-1, result.length());
		result.append("}");
		return result.toString();
	}
}
