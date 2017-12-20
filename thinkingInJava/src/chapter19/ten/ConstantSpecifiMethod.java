package chapter19.ten;

import java.text.DateFormat;
import java.util.Date;

/**
 * 为每个enum实例添加方法
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
