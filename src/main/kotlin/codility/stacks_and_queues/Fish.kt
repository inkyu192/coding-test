package codility.stacks_and_queues

class Fish {
    fun solution(A: IntArray, B: IntArray): Int {
        var surviveCount = 0
        val deque = ArrayDeque<Int>()

        for (i in A.indices) {
            if (B[i] == 0) {
                var isSurvive = true

                while (deque.isNotEmpty()) {
                    val last = deque.last()
                    if (last < A[i]) {
                        deque.removeLast()
                    } else if (last > A[i]) {
                        isSurvive = false
                        break
                    }
                }

                if (isSurvive) surviveCount++
            } else if (B[i] == 1) {
                deque.addLast(A[i])
            }
        }

        return surviveCount + deque.size
    }
}