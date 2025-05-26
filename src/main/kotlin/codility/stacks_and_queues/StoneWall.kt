package codility.stacks_and_queues

class StoneWall {
    fun solution(H: IntArray): Int {
        var count = 0
        val deque = ArrayDeque<Int>()

        for (value in H) {
            while (deque.isNotEmpty() && deque.last() > value) {
                deque.removeLast()
            }

            if (deque.isEmpty() || deque.last() < value) {
                deque.addLast(value)
                count++
            }
        }

        return count
    }
}