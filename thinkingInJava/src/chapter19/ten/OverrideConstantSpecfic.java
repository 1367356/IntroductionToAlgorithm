package chapter19.ten;

/**
 * ���ǳ�����صķ���
 * @author admin
 *
 */
public enum OverrideConstantSpecfic {

	NUT,BOLT,WASHER{
		void f(){
			System.out.println("overriden mehtod");
		}
	};
	void f(){
		System.out.println("default behavior");
	}
	
	public static void main(String[] args) {
		for(OverrideConstantSpecfic ocs:values()){
			System.out.println("ocs:"+ocs);
			ocs.f();
		}
	}
}
