package chapter17.six;

public class TreeType extends SetType implements Comparable<TreeType>{

	public TreeType(int n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

	public int compareTo(TreeType arg) {
		// TODO Auto-generated method stub
		return (arg.i<i? -1:(arg.i==i? 0:1));  //-1传递进来的对象小于调用对象
	}
	

}
