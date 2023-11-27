package Tree;

public class Node<A> {
	public A data;
	public Node<A> left;
	 public Node<A> right;
	Node (A data){
		this.data=data;
	}

	public static void main(String[] args) {
		Node<Integer>root=new Node<Integer>(19);
	root.left=new Node<Integer>(17);
	root.right=new Node<Integer>(22);
	root.left.left=new Node<Integer>(7);
	root.left.left.left=new Node<Integer>(33);
	root.left.right=new Node<Integer>(2);
	root.left.left.right=new Node<Integer>(31);
	root.left.right.left=new Node<Integer>(8);
	root.left.right.right=new Node<Integer>(32);
	root.right.left=new Node<Integer>(8);
	root.right.right=new Node<Integer>(6);
	root.right.left.left=new Node<Integer>(12);
	root.right.left.right=new Node<Integer>(70);
	TreeTraversal traversal=new TreeTraversal(root);
	traversal.inOrder();
	System.out.println("---------------");
	traversal.preOrder();
	System.out.println("---------------");
	traversal.postOrder();
	}

}
