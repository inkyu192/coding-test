package codility.stacks_and_queues

class Brackets {
    fun solution(S: String): Int {
        val deque = ArrayDeque<Char>()

        for (i in S.indices) {
            when {
                S[i] == '(' || S[i] == '[' || S[i] == '{' -> deque.addLast(S[i])
                S[i] == ')' -> if (deque.isEmpty() || deque.removeLast() != '(') return 0
                S[i] == ']' -> if (deque.isEmpty() || deque.removeLast() != '[') return 0
                S[i] == '}' -> if (deque.isEmpty() || deque.removeLast() != '{') return 0
            }
        }

        return if(deque.isEmpty()) 1 else 0
    }
}