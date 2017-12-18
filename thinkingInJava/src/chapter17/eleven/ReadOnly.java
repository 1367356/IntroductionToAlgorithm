package chapter17.eleven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/**
 * ֻ������
 * @author admin
 *
 */
public class ReadOnly {

	static Collection<String> data=new ArrayList<String>(Arrays.asList("one two three".split(" ")));
	
	public static void main(String[] args) {
		Collection<String> c=Collections.unmodifiableCollection(new ArrayList<String>(data));
		System.out.println(c);  
		
		List<String> a=Collections.unmodifiableList(new ArrayList<String>(data));//��������װ�ɲ����޸�����
		ListIterator<String> lit=a.listIterator();
		System.out.println(lit.next());
		
		Set<String> s=Collections.unmodifiableSet(new HashSet<String>(data));
		System.out.println(s);
	}
}
