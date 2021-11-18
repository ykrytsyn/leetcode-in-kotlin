package leetcode

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import kotlin.test.assertEquals

class CheckIfNAndItsDoubleExistTest {

    @ParameterizedTest(name = "{0} => {1}")
    @CsvSource("10,2,5,3=true", "7,1,14,11=true", "3,1,7,11=false", delimiter = '=')
    fun `Check if N and it's double exist`(input: String, expectedValue: String) {
        val inputString = input.split(",")
        val inputInt = inputString.map { it.toInt() }.toIntArray()

        assertEquals(CheckIfNAndItsDoubleExist().checkIfExists(inputInt), expectedValue.toBoolean(),
            "checkIfExists() method has an error!")
    }

}
