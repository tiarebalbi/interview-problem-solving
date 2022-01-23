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

import java.util.Arrays
import java.util.Collections

/**
 * Simple implementation of the Binary Search Algorithm
 *
 *
 * @author Tiare Balbi Bonamini
 *
 * // Existent implementations on Java
 * @see Arrays.binarySearch
 * @see Collections.binarySearch
 */
object BinarySearch {
    private const val NOT_FOUND = -1

    fun search(data: List<Int>, expectedValue: Int, lowestNumber: Int, highestNumber: Int): Int {
        if (highestNumber < lowestNumber || expectedValue > highestNumber) return NOT_FOUND
        if (expectedValue < lowestNumber) return NOT_FOUND

        val middle = (lowestNumber + highestNumber) / 2

        println("Searching $expectedValue between $lowestNumber until $highestNumber (middle: $middle, data: ${data[middle]})")

        return when {
            expectedValue == data[middle] -> data[middle]
            expectedValue < data[middle] -> search(data, expectedValue, lowestNumber, middle - 1)
            else -> search(data, expectedValue, middle + 1, highestNumber)
        }
    }
}
