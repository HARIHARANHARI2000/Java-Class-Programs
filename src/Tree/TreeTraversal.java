package Tree;

public class TreeTraversal {
	Node<Integer>root;
	public TreeTraversal(Node<Integer>root) {
		this.root=root;
	}
	public void inOrder() {
		inOrder(root);
	}
	public void inOrder(Node<Integer>currentRoot) {
		if(currentRoot !=null) {
			inOrder(currentRoot.left);
			System.out.println(currentRoot.data);
			inOrder(currentRoot.right);
		}
	}
	public void preOrder() {
		preOrder(root);
}
	public void preOrder(Node<Integer>currentRoot) {
		if(currentRoot !=null) {
			preOrder(currentRoot.left);
			System.out.println(currentRoot.data);
			preOrder(currentRoot.right);
		}
	}
}
