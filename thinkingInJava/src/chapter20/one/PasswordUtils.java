package chapter20.one;

import java.util.List;

public class PasswordUtils {

	//使用的注解内容看将会被注解处理器，取出并解析。spring中写不同的注解内容（提前定义好的），将会对应不同的处理结果
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
