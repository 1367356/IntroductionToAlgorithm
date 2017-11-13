package chapter07;

public class Beetle extends Insect{

	private int k=printInit("Beetle.k initialized");
	public Beetle() {
		// TODO Auto-generated constructor stub
		System.out.println("k"+k);
		System.out.println("j"+j);
	}
	public static void main(String[] args) {
		System.out.println("Beetle constructor");
		Beetle b=new Beetle();
	}
	static{
		System.out.println("Beetle static coding area");
	}
	private static int x2=printInit("static Beetle.x2 initialized");
	{
		System.out.println("Beetle constructor coding area");
	}
	/**
 执行结果
静态方法和数据根据在程序中位置的先后加载
static insect.x1 initialized  父类的静态数据和静态方法
Insect static coding area    父类的 静态代码块
Beetle static coding area    子类的静态代码块
static Beetle.x2 initialized 子类的静态数据和静态方法  
Beetle constructor    //进入主函数，因为主函数也是静态的，System.out.println("Beetle constructor");
Insert constructor coding area  父类的构造代码块
i9,j0                           父类的构造函数
Beetle.k initialized            子类的构造函数中需要加载的数据
Beetle constructor coding area    子类的构造代码块
k47                     子类的构造函数，类初始化，创建实例时。
j39


	 */
}
