package chapter17.eleven;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * �������޸�Ϊͬ�����Ƶ�����s
 * @author admin
 *
 */
public class Synchronization {

	public static void main(String[] args) {
		Collection<String> c=Collections.synchronizedCollection(new ArrayList<String>());//�������޸�Ϊͬ�����Ƶ�����
		List<String> list=Collections.synchronizedList(new ArrayList<String>());
		Set<String> set=Collections.synchronizedSet(new HashSet<String>());
	}
}
