package chapter11.five;

public class FamilyVsExactType {

	static void test(Object obj){
		System.out.println("Testing obj of type:   "+obj.getClass());
		System.out.println("obj instance of Base:   "+(obj instanceof Base));
		System.out.println("obj instance of Derived:   "+(obj instanceof Derived));
		System.out.println("Derived.isInstance(obj):   "+Derived.class.isInstance(obj));
		System.out.println("x.getClass==Base.class:   "+(obj.getClass()==Base.class));
		System.out.println("obj.getClass==Derived.class:   "+(obj.getClass()==Derived.class));
		System.out.println("obj.getClass.equals(Base.class):   "+(obj.getClass().equals(Base.class)));
		System.out.println("obj.getClass.equals(Derived.class):   "+(obj.getClass().equals(Derived.class)));
	}
	public static void main(String[] args) {
		test(new Base());
		test(new Derived());
	}
}
