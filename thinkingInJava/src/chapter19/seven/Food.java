package chapter19.seven;

/**
 * 使用接口组织枚举
 * @author admin
 *
 */
public interface Food {

	enum Appetizer implements Food{
		SALAD,SOUP,SPIRNG;
	}
	enum MainCourse implements Food{
		LASAGNE,BURRITO,PAD_THAT
	}
}
