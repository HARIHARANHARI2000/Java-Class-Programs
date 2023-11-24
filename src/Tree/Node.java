package Tree;

public class Node<A> {
	A data;
	public Node<A> left;
	 public Node<A> right;
	Node (A data){
		this.data=data;
	}

	public static void main(String[] args) {
		Node<Integer>root=new Node<Integer>(10);
	root.left=new Node<Integer>(20);
	root.right=new Node<Integer>(30);
	root.left.left=new Node<Integer>(40);
	root.left.left.left=new Node<Integer>(40);
	root.left.right=new Node<Integer>(40);
	root.left.left.right=new Node<Integer>(40);
	root.left.right.left=new Node<Integer>(40);
	root.left.right.right=new Node<Integer>(50);
	root.right.left.left=new Node<Integer>(60);
	root.right.left.right=new Node<Integer>(70);
	TreeTraversal traversal=new TreeTraversal(root);
	traversal.inOrder();
	System.out.println("---------------");
	traversal.preOrder();
	}

}
