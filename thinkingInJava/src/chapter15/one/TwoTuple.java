package chapter15.one;

public class TwoTuple<A,B> {
	
	public final A first;
	public final B two;

	public TwoTuple(A first,B two) {
		this.first = first;
		this.two=two;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+first+","+two+")";
	}
	
}
