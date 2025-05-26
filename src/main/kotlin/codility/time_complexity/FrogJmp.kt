package codility.time_complexity

class FrogJmp {
    fun solution(X: Int, Y: Int, D: Int): Int {
        val distance = Y - X
        return (distance + D - 1) / D
    }
}