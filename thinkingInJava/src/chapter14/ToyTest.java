package chapter14;

public class ToyTest {

	private static void printInfo(Class cc) {
		// TODO Auto-generated method stub
		System.out.println("Class name:"+cc.getName()+
				"isInterface?"+cc.isInterface());
		System.out.println("Simple name:"+cc.getSimpleName());
		System.out.println("Canonical name"+cc.getCanonicalName());
	}
	public static void main(String[] args) {
		Class c=null;
		try {
			c=Class.forName("chapter11.FancyToy");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("can't find FancyToy Class");
			System.exit(1);
		}
		printInfo(c);
		for(Class face:c.getInterfaces())
			printInfo(face);
		Class up=c.getSuperclass();
		Object obj=null;
		try {
			obj=up.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			System.out.println("can't instantiation");
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			System.out.println("can't access");
			e.printStackTrace();
		}
		printInfo(obj.getClass());
		
		String t=Waterproof.class.getName();
		System.out.println(t);
	}
}
