package chapter20.two;

@DBTable(name="MEMBER")
public class Member {

	@SQLString(value=30,name="firstName ")String firstName;//30�Ǹ�����String��Ĭ��ֵ
	@SQLString(value=50,name="lastName ")String lastName;
	@SQLInteger(name="age ")Integer age;
	//ע���Ƕ��ʹ��
	@SQLString(value=30,constraints=@Constraints(primaryKey=true))
	String handle;
	static int memberCount;
	public String getHandle(){
		return handle;
	}
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return handle;
	}
	public Integer getAge(){
		return age;
	}
	
}
