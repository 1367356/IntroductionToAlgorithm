package chapter20.one;

import java.util.List;

public class PasswordUtils {

	//ʹ�õ�ע�����ݿ����ᱻע�⴦������ȡ����������spring��д��ͬ��ע�����ݣ���ǰ����õģ��������Ӧ��ͬ�Ĵ������
	@UseCase(id=47,description="passwords must contain at least one numberic")
	public boolean validatePassword(String password){
		return (password.matches("\\w*\\d\\w*"));
	}
	
	@UseCase(id=48)
	public String encryptPassword(String password){
		return new StringBuilder(password).reverse().toString();
	}
	
	@UseCase(id=49,description="New passwords can't equal pre viously used ones")
	public boolean chenkForNewPassword(List<String> prePasswords,String password){
		return !prePasswords.contains(password);
	}
	
}