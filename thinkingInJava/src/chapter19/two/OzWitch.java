package chapter19.two;

public enum OzWitch {

	//实例必须在方法之前定义
	West("West"), //相当于一个带产数的构造函数，带产构造函数要在下面定义
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
