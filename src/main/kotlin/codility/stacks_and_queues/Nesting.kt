package codility.stacks_and_queues

class Nesting {
    fun solution(S: String): Int {
        val deque = ArrayDeque<Char>()

        for (i in S.indices) {
            if (S[i] == '(') {
                deque.addLast('(')
            } else if (S[i] == ')') {
                if (deque.isEmpty()) return 0
                deque.removeLast()
            }
        }

        return if(deque.isEmpty()) 1 else 0
    }
}