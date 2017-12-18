package chapter17.eleven;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 将容器修改为同步控制的容器s
 * @author admin
 *
 */
public class Synchronization {

	public static void main(String[] args) {
		Collection<String> c=Collections.synchronizedCollection(new ArrayList<String>());//将容器修改为同步控制的容器
		List<String> list=Collections.synchronizedList(new ArrayList<String>());
		Set<String> set=Collections.synchronizedSet(new HashSet<String>());
	}
}
