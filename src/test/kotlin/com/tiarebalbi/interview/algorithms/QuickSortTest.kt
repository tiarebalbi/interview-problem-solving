package com.tiarebalbi.interview.algorithms

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import kotlin.system.measureNanoTime
import kotlin.time.Duration.Companion.nanoseconds

class QuickSortTest {

    @ParameterizedTest(name = "Sort input numbers between {0} and {1} using quickSort")
    @CsvSource(
        "1,   1000",
        "1,   10000",
        "1,   100000"
    )
    fun `should sort array of integers using quicksort`(from: Int, to: Int) {
        val input = (from until to).shuffled().toIntArray()
        val expected = (from until to).sorted().toIntArray()

        val totalTime = measureNanoTime {
            val result = QuickSort.sort(input, 0, input.size - 1)
            Assertions.assertTrue { expected.contentEquals(result) }
        }

        println("Completed in ${totalTime.nanoseconds.inWholeMilliseconds}ms")
    }
}
