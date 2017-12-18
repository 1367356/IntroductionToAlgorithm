package chapter16.one;

public class BeryllimSphere {

	private static long counter;
	private final long id=counter++;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Sphere"+id;
	}
}
