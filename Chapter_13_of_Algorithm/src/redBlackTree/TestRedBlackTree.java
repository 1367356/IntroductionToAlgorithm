package redBlackTree;

/**
 * 红黑树测试类
 * @author liyafei
 *
 */
public class TestRedBlackTree {
		public static void main(String[] args) {
			RedBlackTree<Integer> rbt=new RedBlackTree<Integer>();
			rbt.insert(5);
			rbt.insert(9);
			rbt.insert(2);
			rbt.print();
		}
}
