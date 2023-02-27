package inflearn.introduction.section_7.problem_5;

/**
 * 5. 이진트리순회(DFS : Depth-First Search)
 */
class Node {
    int data;
    Node left, right;

    public Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}

public class Main {

    Node root;

    public void DFS(Node root) {
        if (root == null) {
            return;
        } else {
            DFS(root.left);
            System.out.print(root.data + " ");
            DFS(root.right);
        }
    }

    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.DFS(tree.root);
    }
}
