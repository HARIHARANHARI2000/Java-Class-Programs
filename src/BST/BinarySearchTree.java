package BST;

public class BinarySearchTree {
	Node root;
	 
    BinarySearchTree() {
        root = null;
    }
    
    void insert(int key) {
    	insert(root, key);
    }
    
    Node insert(Node node, int key) {
       
        if (node == null) {
            node = new Node(key);
            if(root == null)
            {
            	root = node;
            }
            return node;
        }
 
      
        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
 
      
        return node;
    }
 
    
    Node search(Node root, int key) {
      
        if (root == null || root.key == key)
            return root;
 
       
        if (root.key < key)
            return search(root.right, key);
 
       
        return search(root.left, key);
    }
 
}


