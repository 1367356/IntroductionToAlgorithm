package chapter17.seven;

import java.util.PriorityQueue;

//自己创建队列
public class ToDoList extends PriorityQueue<ToDoList.ToDoItem>{

	static class ToDoItem implements Comparable<ToDoItem>{

		private char primary;
		private int secondary;
		private String item;
		
		public ToDoItem(char primary, int secondary, String item) {
			super();
			this.primary = primary;
			this.secondary = secondary;
			this.item = item;
		}

		public int compareTo(ToDoItem arg) {
			// TODO Auto-generated method stub
			if(primary>arg.primary){
				return +1;
			}
			if(primary==arg.primary){
				if(secondary>arg.secondary){
					return +1;
				}
				else if(secondary==arg.secondary){
					return 0;
				}
			}
			return -1;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}

	}
	
	public void add(String td,char pri,int sec){
		super.add(new ToDoItem(pri, sec, td));
	}
	public static void main(String[] args) {
		ToDoList toDoList=new ToDoList();
		toDoList.add("empty trash", 'c', 4);
		toDoList.add("feed dog",'b',2);
		while(!toDoList.isEmpty()){
			System.out.println(toDoList.remove());
		}
	}

}
