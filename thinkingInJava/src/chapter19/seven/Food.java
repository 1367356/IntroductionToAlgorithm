package chapter19.seven;

/**
 * ʹ�ýӿ���֯ö��
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