package chapter20.three;


@ExtractInterface("IMultiplier")   //将所有公共方法提取出来作为借口
public class Multiplier {

	public int multiplier(int x,int y){
		int total=0;
		for (int i = 0; i < x; i++) {
			total=add(total,y);
		}
		return total;
	}

	private int add(int total, int y) {
		// TODO Auto-generated method stub
		return total+y;
	}
	
	public static void main(String[] args) {
		Multiplier m=new Multiplier();
		System.out.println("11*16="+m.multiplier(11, 16));
	}
}
