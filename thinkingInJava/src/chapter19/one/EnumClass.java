package chapter19.one;

public class EnumClass {

	public static void main(String[] args) {
		for(Shrubbery s:Shrubbery.values()){
			System.out.println(s+"oridal"+s.ordinal());
			System.out.println(s.compareTo(Shrubbery.GROUND));
			System.out.println(s==Shrubbery.CRAWLING);
			System.out.println(s.getDeclaringClass());
			System.out.println(s.name());
		}
		System.out.println("-----------------------------");
		for(String s:"GROUND CRAWLING HANGING".split(" ")){
			Shrubbery shrub=Enum.valueOf(Shrubbery.class, s);//将上面的类型变为枚举类中的元素
			System.out.println(shrub);
		}
	}
}
