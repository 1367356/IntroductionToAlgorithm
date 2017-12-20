package chapter19.four;

public class UpcastEnum {

	public static void main(String[] args) {
		Search[] vals=Search.values();
		Enum e=Search.HITHER;
		for(Enum en:e.getClass().getEnumConstants()){
			System.out.println(en);
		}
	}
}
