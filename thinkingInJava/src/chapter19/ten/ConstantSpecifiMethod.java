package chapter19.ten;

import java.text.DateFormat;
import java.util.Date;

/**
 * Ϊÿ��enumʵ����ӷ���
 * @author admin
 *
 */
public enum ConstantSpecifiMethod {

	DATE_TIME{
		String getInfo(){
			return DateFormat.getDateInstance().format(new Date());
		}
	},
	
	CLASSPATH{
		String getInfo(){
			return System.getenv("CLASSPATH");
		}
	},
	
	VERSION{
		String getInfo(){
			return System.getProperty("java.version");
		}
	};
	abstract String getInfo();
	public static void main(String[] args) {
		for(ConstantSpecifiMethod csm:values()){
			System.out.println(csm.getInfo());
		}
	}
}
