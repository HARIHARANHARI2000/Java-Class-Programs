package ProblemsTree;

public class problem1traversal {
	problem1 n;
	public problem1traversal(problem1 n) {
		this.n=n;
	}
	public void inOrder() {
		inOrder(n);
	}
	public void inOrder(problem1 currentn) {
		if(currentn !=null) {
			inOrder(currentn.left);
			System.out.print(" "+currentn.data);
			inOrder(currentn.right);
		}
	}
	public void preOrder() {
		preOrder(n);
	}
	public void preOrder(problem1 currentn) {
		if(currentn !=null) {
			preOrder(currentn.right);
			System.out.print(" "+currentn.data);
			preOrder(currentn.left);
		}
	}
	public void postOrder() {
		postOrder(n);
	
	}
	public void postOrder(problem1 currentn) {
		if(currentn !=null) {
			postOrder(currentn.left);
			postOrder(currentn.right);
			System.out.print(" "+currentn.data);
		}
		}
}