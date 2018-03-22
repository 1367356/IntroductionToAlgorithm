package chapter20.two;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Ĭ��ֵ���ã���Ϊ���ܳ���null,����һ������Ϊ-1��" "��
 * @author admin
 *
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SimulatingNull {

	public int id() default -1;
	public String description() default " ";
}