package chapter10;

public class Parcel1 {

	class Contents{
		private int i=11;
		public int value() {
			return i;
		}
	}
	public static void main(String[] args) {
		Parcel1 p=new Parcel1();
		Parcel1.Contents pc=p.contents();
		
	}
	private Contents contents() {
		// TODO Auto-generated method stub
		return new Contents();
	}
	
}
