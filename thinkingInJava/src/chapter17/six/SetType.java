package chapter17.six;

public class SetType {

	int i;
	public SetType(int n) {
		// TODO Auto-generated constructor stub
		i=n;
	}
	public boolean equals(Object o){
		return o instanceof SetType && (i==((SetType)o).i);  //���ж������Ƿ���ͬ�����ж϶����е�ֵ�Ƿ���ͬ
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Integer.toString(i);
	}
}