package inflearn.introduction.section_5.problem_8;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 8. 응급실
 */
public class Main {

    private class Person {

        int order;
        int priority;

        public Person(int order, int priority) {
            this.order = order;
            this.priority = priority;
        }
    }

    public int solution(int n, int m, int[] arr) {
        Queue<Person> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.offer(new Person(i, arr[i]));
        }

        int answer = 0;

        while (true) {
            Person poll = queue.poll();

            for (Person person : queue) {
                if (poll.priority < person.priority) {
                    queue.offer(poll);
                    poll = null;
                    break;
                }
            }

            if (poll != null) {
                answer++;

                if (poll.order == m) return answer;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }
}
