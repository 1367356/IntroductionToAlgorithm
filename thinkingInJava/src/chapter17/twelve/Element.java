package chapter17.twelve;

public class Element {

	private String ident;
	public Element(String id) {
		// TODO Auto-generated constructor stub
		ident=id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ident;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return ident.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return obj instanceof Element && ident.equals(((Element)obj).ident);
	}
	protected void finalize(){
		System.out.println("Finalizing"+getClass().getSimpleName()+" "+ident);
	}
}
