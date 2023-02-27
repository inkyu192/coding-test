package inflearn.introduction.section_7.problem_10;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 10. Tree 말단노드까지의 까장 짧은 경로(BFS)
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

    public int BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node poll = queue.poll();

                if (poll.left == null && poll.right == null) {
                    return level;
                } else if (poll.left != null) {
                    queue.offer(poll.left);
                } else if (poll.right != null) {
                    queue.offer(poll.right);
                }
            }

            level++;
        }

        return 0;
    }

    public static void main(String args[]) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println(tree.BFS(tree.root));
    }
}
