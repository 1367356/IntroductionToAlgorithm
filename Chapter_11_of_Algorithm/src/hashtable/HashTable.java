package hashtable;

import java.util.ArrayList;

public class HashTable {
				public void hashInsert(ArrayList<Integer> al,int x){
					al.add(hashFunction(x), x);
				}

				private int hashFunction(int x) {
					// TODO Auto-generated method stub
					return x*2;
				}
				public <T> void print(ArrayList<T> al){
					for (int i = 0; i < al.size(); i++) {
						System.out.println(al.get(i));
					}
					
				}
}
