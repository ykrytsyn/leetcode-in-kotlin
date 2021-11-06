package leetcode

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import kotlin.test.assertEquals

class UniquePathsTest {

    @ParameterizedTest(name = "Grid {0} => {1} unique paths")
    @CsvSource("3x7,28", "3x2,3", "7x3,28", "3x3,6", delimiter = ',')
    fun `Verify Unique Path`(input: String, expectedValue: String) {
        val params = input.split("x")
        val m = params[0].toInt()
        val n = params[1].toInt()

        assertEquals(UniquePaths().dynamicProgramming(m, n), expectedValue.toInt(),
            "dynamicProgramming() method has an error!")

        assertEquals(UniquePaths().recursive(m, n), expectedValue.toInt(),
            "recursive() method has an error!")
    }
}
