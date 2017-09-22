package binarytree;

public class BinaryTree<T extends Comparable<T>> {
	Node<T> root = null;

	public class Node<T extends Comparable<T>> {
		Node leftChild;
		Node rightChild;
		Node parent;
		T key;
	}

	public void print(Node node) {
		System.out.println(node.leftChild.key);
	}
	
	public void delete(T key){
		Node newNode=new Node();
		newNode.key=key;
		Node tem=root;
		
		while(newNode.key!=tem.key){
			if (newNode.key.compareTo(tem.key) < 0) {
				tem = tem.leftChild;
			} else {
				tem = tem.rightChild;
			}
		}
		//tem是最后和给定值相等的节点。
		if tem.rightChild==null
				transplant();
		else if  tem.rightChild==null
				transplant();
		else y=treeMinimum(tem.rightChild)   //右孩子中的最小值。
				if
	}

	private void transplant() {
		// TODO Auto-generated method stub
		
	}

	public void insert(T key) { // 向二叉树中插入
		Node newNode = new Node();
		newNode.key = key;
		Node tem = root;
		Node p = null;
		while (tem != null) {
			p = tem;
			if (newNode.key.compareTo(tem.key) < 0) {
				tem = tem.leftChild;
			} else {
				tem = tem.rightChild;
			}
		}
		newNode.parent = p;

		if (p == null) {                           //二叉树为空时。
			root = newNode;

		} else if ((newNode.key).compareTo(p.key) < 0) {

			p.leftChild = newNode;
		} else {
			p.rightChild = newNode;
		}
	}

}
