package chapter17.twelve;

public class VeryBig {

	private static final int SIZE=10000;
	private long[] la=new long[SIZE];
	private String ident;
	public VeryBig(String id) {
		// TODO Auto-generated constructor stub
		ident=id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ident;
	}
	protected void finalize(){
		System.out.println("Finalizing:"+ident);
	}
}
