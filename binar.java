import java.util.LinkedList;
import java.util.Queue;

public class binar {

    // Node class
    static class GateNode {
        int data;
        GateNode leftChild;
        GateNode rightChild;

        public GateNode(int data) {
            this.data = data;
            this.leftChild = null;
            this.rightChild = null;
        }
    }

    GateNode root;

    // Insert node using level-order
    public void insert(int data) {
        GateNode newNode = new GateNode(data);

        if (root == null) {
            root = newNode;
            return;
        }

        Queue<GateNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            GateNode current = queue.poll();

            if (current.leftChild == null) {
                current.leftChild = newNode;
                return;
            } else {
                queue.add(current.leftChild);
            }

            if (current.rightChild == null) {
                current.rightChild = newNode;
                return;
            } else {
                queue.add(current.rightChild);
            }
        }
    }

    // Inorder Traversal
    public void inorder(GateNode node) {
        if (node == null)
            return;

        inorder(node.leftChild);
        System.out.print(node.data + " ");
        inorder(node.rightChild);
    }

    // Preorder Traversal
    public void preorder(GateNode node) {
        if (node == null)
            return;

        System.out.print(node.data + " ");
        preorder(node.leftChild);
        preorder(node.rightChild);
    }

    // Postorder Traversal
    public void postorder(GateNode node) {
        if (node == null)
            return;

        postorder(node.leftChild);
        postorder(node.rightChild);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        binar tree = new binar();

        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);

        System.out.print("Inorder: ");
        tree.inorder(tree.root);

        System.out.print("\nPreorder: ");
        tree.preorder(tree.root);

        System.out.print("\nPostorder: ");
        tree.postorder(tree.root);
    }
}