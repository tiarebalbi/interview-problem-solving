/*
 * Copyright 2018 @tiarebalbi
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.tiarebalbi.interview.algorithms

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class BinarySearchTest {

    @ParameterizedTest(name = "{0} between {1} and {2} to be {3}")
    @CsvSource(
        "30,    0,   100,  true",
        "89,    0,   20000,  true",
        "189,   0,   100,  false",
        "189,   200,   1000,  false"
    )
    fun `should be able to find value in the list`(expectedValue: Int, lowestNumber: Int, highestNumber: Int, verification: Boolean) {
        val data = (lowestNumber until highestNumber).toList()

        val result = BinarySearch.search(data, expectedValue, lowestNumber, highestNumber)

        Assertions.assertEquals(verification, result == expectedValue)
    }
}
