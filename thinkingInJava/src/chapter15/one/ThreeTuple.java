package chapter15.one;

public class ThreeTuple<A,B,C> extends TwoTuple<A, B> {

	public final C thrid;
	public ThreeTuple(A first, B two,C thrid) {
		super(first, two);
		// TODO Auto-generated constructor stub
		this.thrid=thrid;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+first+","+two+","+thrid+")";  //first,two�Ǽ̳й����ģ�������ThreeTuple���涨��
	}
}
