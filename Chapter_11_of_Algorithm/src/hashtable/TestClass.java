package hashtable;

import java.util.ArrayList;

import org.omg.PortableInterceptor.INACTIVE;

public class TestClass {
	        public static HashTable ht=new HashTable();
			public static void main(String[] args) {
				ArrayList<Integer> al=new ArrayList<>();
				;
				ht.hashInsert(al, 5);
				ht.hashInsert(al, 2);
				ht.hashInsert(al, 6);
				ht.hashInsert(al, 7);
				ht.print(al);
			}
}
