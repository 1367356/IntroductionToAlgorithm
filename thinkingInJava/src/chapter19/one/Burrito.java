package chapter19.one;

//静态导入枚举类型
import static chapter19.one.Spiciness.*;
public class Burrito {

	Spiciness degree;
	public Burrito(Spiciness degree) {
		// TODO Auto-generated constructor stub
		this.degree=degree;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Burrito is: "+degree;
	}
	
	public static void main(String[] args) {
		System.out.println(new Burrito(MEDIUM));
	}
}
