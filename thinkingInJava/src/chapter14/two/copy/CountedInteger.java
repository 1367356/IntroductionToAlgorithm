package chapter14.two.copy;

class CountedInteger {

	private static long counter;
	private final long id=counter++;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Long.toString(id);
	}
}
