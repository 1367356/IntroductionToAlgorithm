package chapter19.two;

public enum OzWitch {

	//ʵ�������ڷ���֮ǰ����
	West("West"), //�൱��һ���������Ĺ��캯�����������캯��Ҫ�����涨��
	NORTH("North"),
	EAST("EAST");
	private String description;
	private OzWitch(String description) {
		// TODO Auto-generated constructor stub
		this.description=description;
	}
	
	public String getDescription(){
		return description;
	}
	public static void main(String[] args) {
		for(OzWitch ow:OzWitch.values()){
			System.out.println(ow+" :"+ow.getDescription());
		}
	}
}