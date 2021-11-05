package leetcode

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import kotlin.test.assertEquals

class ArrangingCoinsTest {

    @ParameterizedTest(name = "{0} coins => {1} steps")
    @CsvSource("0,0", "5,2", "8,3", "123456,496", "1804289383,60070", delimiter = ',')
    fun `Verify Arranging Coins`(input: String, expectedValue: String) {
        assertEquals(ArrangingCoins().bruteForce(input.toInt()), expectedValue.toInt(),
            "bruteForce() method has an error!")
        assertEquals(ArrangingCoins().binarySearch(input.toInt()), expectedValue.toInt(),
            "binarySearch() method has an error!")
    }
}
