package chapter15.one;

public class FourTuple<A,B,C,D>  extends ThreeTuple<A, B, C>{

	public final D four;
	public FourTuple(A first, B two, C thrid,D four) {
		super(first, two, thrid);
		// TODO Auto-generated constructor stub
		this.four=four;
	}
	@Override
	public String toString() {
		return "("+first+","+two+","+thrid+","+four+")";  
	}

}
