package chapter05;

/**
 *打印结果，所以静态代码块先执行，然后构造代码块，然后执行构造函数，构造函数是静态的，
j47
k6
i5
 * 静态代码优先于非静态的代码，是因为被static修饰的成员都是类成员，
 * 会随着JVM加载类的时候加载而执行，
 * @author admin
 *
 */
public class BowlTest {

	public static void main(String[] args) {
		/**
	    Bowl bowl; 
		System.out.println("下面创造实例");
		bowl=new Bowl(5);
		执行结果
		下面创造实例
		j47
		k6
		i5
		*/
	    Bowl bowl=null; 
		System.out.println("下面创造实例");
		bowl=new Bowl(5);
	}

}
