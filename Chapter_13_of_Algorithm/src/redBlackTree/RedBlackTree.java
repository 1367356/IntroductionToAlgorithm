package redBlackTree;

/**
 * 红黑树结构
 * @version v1.0
 * @author liyafei
 *
 * @param <T>  参数T是红黑树能够操作存储的泛型，红黑树是一种数据结构，因此树中节点需要存储数据，而T作为参数类型
 *                              保证了红黑树能够存储任意类型的数据，当然一个节点中也可以存储多个数据。另外由于本次测试代码，
 *                              使用的是整形类型，因此使T继承了Comparable接口， 使其具有比较功能，这样书中节点插入删除时，
 *                              可以通过比较大小，来确定插入，删除的位置。	
 */
public class RedBlackTree <T extends Comparable<T>>{
	   //红黑树中树的颜色通过boolean型数据进行模拟
		public static final boolean RED=true;
		public static final boolean BLACK=false;
	    public RBTreeNode NIL;          //树中 的NIL节点
	    public RBTreeNode root;        //树中的跟节点
	    
	    /**
	     * 红黑树中的节点类，本节点类包含5个属性，左子节点，右子节点，父节点，存储的泛型数据，红黑属性
	     * @author liyafei
	     *
	     * @param <T>  节点类中的参数T与上面红黑树介绍的参数T说明相同。
	     */
		public class RBTreeNode<T extends Comparable<T>>{
			RBTreeNode leftChild;
			RBTreeNode rightChild;
			RBTreeNode parent;
			T key;
			boolean color;
		}
		
		/**
		 * 打印红黑树中的泛型数据
		 */
		public  void print() {
			// TODO Auto-generated method stub
			System.out.println(root.leftChild.key);
			System.out.println(root.rightChild.key);
		}
		
		/**
		 * 向红黑树中插入一个节点
		 * @param key   泛型数据key，通过使用泛型数据key，构造一个红黑树节点，通过比较大小进行插入
		 */
		public void insert(T key){
			RBTreeNode newRBTreeNode=new RBTreeNode<>(); 
			newRBTreeNode.key=key;
			RBTreeNode y=NIL;
			RBTreeNode x=root;
			while(x!=NIL){
				y=x;
				if(newRBTreeNode.key.compareTo(x.key)<0){
					x=x.leftChild;
				}else{
					x=x.rightChild;
				}
			}
			newRBTreeNode.parent=y;
			if(y==NIL){
				root=newRBTreeNode;
			}else if(newRBTreeNode.key.compareTo(y.key)<0){
				y.leftChild=newRBTreeNode;
			}else{
				y.rightChild=newRBTreeNode;
			}
			newRBTreeNode.leftChild=NIL;
			newRBTreeNode.rightChild=NIL;
			newRBTreeNode.color=RED;
			insertFixUp(newRBTreeNode);
		}
		
		/**
		 * 插入辅助函数，由于插入过程中，红黑输的5个性质中某些性质遭到破坏，需要辅助函数进行修正
		 * @param newRBTreeNode     要插入的节点
		 */
		private void insertFixUp(RBTreeNode newRBTreeNode) {
			// TODO Auto-generated method stub
			if(newRBTreeNode.parent!=null){
				while(newRBTreeNode.parent.color==RED){
					if(newRBTreeNode.parent==newRBTreeNode.parent.parent.leftChild){
							RBTreeNode y=newRBTreeNode.parent.parent.rightChild;
							if(y.color==RED){
								newRBTreeNode.parent.color=BLACK;
								y.color=BLACK;
								newRBTreeNode.parent.parent.color=RED;
								newRBTreeNode=newRBTreeNode.parent.parent;
							}else if(newRBTreeNode==newRBTreeNode.parent.rightChild){
								newRBTreeNode=newRBTreeNode.parent;
								leftRotate(newRBTreeNode);
							}else{
								newRBTreeNode.parent.color=BLACK;
								newRBTreeNode.parent.parent.color=RED;
								rightRotate(newRBTreeNode);
							}
					}else{
				            //same as then clause with "right" and "left" changted		
					}
				}
			}

			root.color=BLACK;
		}
		
		/**
		 * 红黑树的右旋操作，假如A节点要执行右旋，将A节点变为左子节点的右孩子，
		 * 左子节点的右孩子变为A节点的左孩子
		 * @param newRBTreeNode   要执行右旋的节点
		 */
		private void rightRotate(RBTreeNode newRBTreeNode) {
			// TODO Auto-generated method stub
			RBTreeNode x=newRBTreeNode.leftChild;
			newRBTreeNode.leftChild=x.rightChild;
			if(x.rightChild!=NIL){
				x.rightChild.parent=newRBTreeNode;
			}
			x.parent=newRBTreeNode.parent;
			if(newRBTreeNode==NIL){
				root=x;
			}else if(newRBTreeNode==newRBTreeNode.parent.leftChild){
				newRBTreeNode.parent.leftChild=x;
			}else{
				newRBTreeNode.parent.rightChild=x;
			}
			x.rightChild=newRBTreeNode;
			newRBTreeNode.parent=x;
		}
		/**
		 * 左旋：假如B节点执行左旋，将B节点变为右子节点的左孩子
		 * 右子节点的左孩子变为B节点的右孩子。
		 * @param newRBTreeNode   要执行左旋的节点。
		 */
		private void leftRotate(RBTreeNode newRBTreeNode) {
			// TODO Auto-generated method stub
			RBTreeNode  y=newRBTreeNode.rightChild;
			newRBTreeNode.rightChild=y.leftChild;
			if(y.leftChild!=null){
				y.leftChild.parent=newRBTreeNode;
			}
			y.parent=newRBTreeNode.parent;
			if(newRBTreeNode.parent==NIL){
				root=y;
			}else if(newRBTreeNode==newRBTreeNode.parent.leftChild){
				newRBTreeNode.parent.leftChild=y;
			}else{
				newRBTreeNode.parent.rightChild=y;
			}
			y.leftChild=newRBTreeNode;
			newRBTreeNode.parent=y;
		}
}
