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
 ִ�н��
��̬���������ݸ����ڳ�����λ�õ��Ⱥ����
static insect.x1 initialized  ����ľ�̬���ݺ;�̬����
Insect static coding area    ����� ��̬�����
Beetle static coding area    ����ľ�̬�����
static Beetle.x2 initialized ����ľ�̬���ݺ;�̬����  
Beetle constructor    //��������������Ϊ������Ҳ�Ǿ�̬�ģ�System.out.println("Beetle constructor");
Insert constructor coding area  ����Ĺ�������
i9,j0                           ����Ĺ��캯��
Beetle.k initialized            ����Ĺ��캯������Ҫ���ص�����
Beetle constructor coding area    ����Ĺ�������
k47                     ����Ĺ��캯�������ʼ��������ʵ��ʱ��
j39


	 */
}