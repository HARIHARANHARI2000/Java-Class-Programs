package BinaryTree;

public class Btree {
		int data;
		Btree left;
		Btree right;
		Btree(int data){
			this.data=data;
			//this.left=left;
			//this.right=right;
		}

		public void main(String[] args) {
			Btree n = new Btree(8);
			n.left=new Btree(6);
			n.right=new Btree(5);
			n.left.left=new Btree(9);
			n.left.right=new Btree(2);
			n.left.left.left=new Btree(21);
			n.left.left.right=new Btree(19);
			n.left.right.left=new Btree(3);
			n.left.right.right=new Btree(16);
			n.right.left=new Btree(1);
			n.right.left.left=new Btree(12);
			n.right.left.right=new Btree(13);
			
			//n.right.right=new Node(1);
		
			Btree root = new Btree(n);
			root.inorder();
			//System.out.println("-------------------------");
		root.preorder();
			//System.out.println();
			//System.out.println();

		}

	}


		 
	    