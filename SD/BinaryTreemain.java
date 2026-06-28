class Node {
    char key;
    Node left, right;

    public Node(char item) {
        key = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    public void insert(char key) {
        root = insertRec(root, key);
    }

    public Node insertRec(Node root, char key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
        return root;
    }

    public void preorder() {
        preorderRec(root);
    }

    public void inorder() {
        inorderRec(root);
    }

    public void postorder() {
        postorderRec(root);
    }

    public void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    public void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    public void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.key + " ");
        }
    }

    public boolean search(char key) {
        return searchRec(root, key);
    }

    public boolean searchRec(Node root, int key) {
        if (root == null)
            return false;

        if (root.key == key)
            return true;

        if (key < root.key)
            return searchRec(root.left, key);
        else
            return searchRec(root.right, key);
    }

}

public class BinaryTreemain {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert('A');
        tree.insert('C');
        tree.insert('B');
        tree.insert('D');
        tree.insert('G');
        tree.insert('F');
        tree.insert('E');
        tree.insert('H');
        tree.insert('I');

        System.out.println("Preorder traversal:");
        tree.preorder();
        System.out.println(" ");
        System.out.println("Inorder traversal:");
        tree.inorder();
        System.out.println(" ");
        System.out.println("Postorder traversal:");
        tree.postorder();

        char searchKey = 'D';
        if (tree.search(searchKey))
            System.out.println("\nKey " + searchKey + " found in the tree.");
        else
            System.out.println("\nKey " + searchKey + " not found in the tree.");

    }
}