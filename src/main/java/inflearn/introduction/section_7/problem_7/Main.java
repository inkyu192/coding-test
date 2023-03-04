package inflearn.introduction.section_7.problem_7;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 7. 이진트리 레벨탐색(BFS)
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

    public void BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node poll = queue.poll();

            System.out.print(poll.data + " ");

            if (poll.left != null) queue.offer(poll.left);
            if (poll.right != null) queue.offer(poll.right);
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
        tree.BFS(tree.root);
    }
}
