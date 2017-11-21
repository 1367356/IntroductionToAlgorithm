package chapter14.six.copy;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

public class ShowMethods {

	private static String usage= "usage:\n"+
	"ShowMethods qualified.class.name\n"+
			  "To show all methods in class or:\n"+
			  "showmethods qualified.class.name word\n"+
			  "To serarch for methods involving word";
	private static Pattern p=Pattern.compile("\\w+\\.");
	public static void main(String[] args) {
		if(args.length<1){
			System.out.println(usage);
			System.exit(0);
		}
		int lines=0;
		try {
			Class<?> c=Class.forName(args[0]);
			Method[] methods=c.getMethods();
			Constructor[] ctros=c.getConstructors();
			if(args.length==1){
				for(Method method:methods){
					System.out.println(p.matcher(method.toString()).replaceAll(""));
				}
				for (Constructor constructor : ctros) {
					System.out.println(p.matcher(constructor.toString()).replaceAll(""));
				}
				lines=methods.length+ctros.length;
			}else
				for(Method method:methods){
					if(method.toString().indexOf(args[1])!=-1){
						System.out.println(p.matcher(method.toString()).replaceAll(""));
					}
					lines++;
				}
			for (Constructor constructor : ctros) {
				if(constructor.toString().indexOf(args[1])!=-1){
					System.out.println(p.matcher(constructor.toString()).replaceAll(""));
				}
				lines++;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("No such class:"+e);
		}
	}
	
}
