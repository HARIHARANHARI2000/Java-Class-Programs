package ProblemsTree;

public class problem1 {
	int data;
	problem1 left;
	problem1 right;
	problem1(int data){
		this.data=data;
	}

	public static void main(String[] args) {
		problem1 n = new problem1(38);
		n.left=new problem1(27);
		n.right=new problem1(25);
		n.left.left=new problem1(20);
		n.left.right=new problem1(18);
		n.left.left.left=new problem1(55);
		n.left.left.right=new problem1(24);
	    n.left.right.left=new problem1(28);
		n.right.left=new problem1(45);
		n.right.right=new problem1(32);
		n.right.left.left=new problem1(39);
		n.right.right.left=new problem1(13);
		n.right.right.right=new problem1(16);
		n.right.left.right=new problem1(8);
		n.right.left.right.right=new problem1(12);
		n.right.left.right.right.left=new problem1(9);
		n.right.right.right.left=new problem1(6);
		n.right.right.right.right=new problem1(4);
		
		problem1traversal traversal = new problem1traversal(n);
		traversal.inOrder();
		System.out.println("-------------------------");
	    traversal.preOrder();
	    System.out.println("--------------------------");
	    traversal.postOrder();
		
		

	}

}
