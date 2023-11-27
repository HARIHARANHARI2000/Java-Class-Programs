package BinaryTree;

//import Tree.Node;

public class BinaryTraversal {
    Btree n;
	public BinaryTraversal(Btree n) {
		this.n=n;
	}
	public void inorder() {
		inorder(n);
	}
public void inorder(Btree currentn) {
	if(currentn != null) {
		inorder(currentn.left);
		System.out.println(" "+currentn.data);
		inorder(currentn.right);
	}
}
public void preorder() {
	preorder(n);
}
public void preorder(Btree currentn) {
	if(currentn!=null) {
		preorder(currentn.right);
		System.out.print(" "+currentn.data);
		preorder(currentn.left);
	}
}
}