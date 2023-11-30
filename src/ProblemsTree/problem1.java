package ProblemsTree;

public class problem1 {
	int data;
	problem1 left;
	problem1 right;
	problem1(int data){
		this.data=data;
	}

	public static void main(String[] args) {
		problem1 n = new problem1(21);
		n.left=new problem1(9);
		n.right=new problem1(6);
		n.left.left=new problem1(23);
		n.left.right=new problem1(18);
		n.left.left.left=new problem1(21);
		n.left.left.right=new problem1(13);
		//n.left.right.left=new problem1(3);
		n.right.left=new problem1(7);
		n.right.right=new problem1(16);
		n.right.left.left=new problem1(17);
		n.right.right.left=new problem1(15);
		n.right.right.left.left=new problem1(11);
		
		

	}

}
