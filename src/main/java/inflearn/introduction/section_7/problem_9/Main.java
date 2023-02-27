package inflearn.introduction.section_7.problem_9;

/**
 * 9. Tree 말단노드까지의 까장 짧은 경로(DFS)
 */
class Node {
    int data;
    Node left, right;

    public Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}

public class Main {

    Node root;

    public int DFS(int L, Node root) {
        if (root.left == null && root.right == null) {
            return L;
        } else {
            return Math.min(DFS(L + 1, root.left), DFS(L + 1, root.right));
        }
    }

    public static void main(String args[]) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println(tree.DFS(0, tree.root));
    }
}
