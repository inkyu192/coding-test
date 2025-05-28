package codility.prime_and_composite_numbers

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class MinPerimeterRectangleTest {
    private val minPerimeterRectangle = MinPerimeterRectangle()

    @Test
    fun case1() {
        val result = minPerimeterRectangle.solution(30)
        Assertions.assertThat(result).isEqualTo(22)
    }
}