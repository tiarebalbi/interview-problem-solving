package com.tiarebalbi.interview.algorithms

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import java.time.Duration
import kotlin.system.measureNanoTime
import kotlin.time.Duration.Companion.nanoseconds
import kotlin.time.toKotlinDuration

class MergeSortTest {

    @Test
    fun `should sort random array`() {
        val input = intArrayOf(2, 8, 5, 3, 9, 4, 1, 7)
        val expected = intArrayOf(1, 2, 3, 4, 5, 7, 8, 9)

        val result = MergeSort.sort(input, input.size)

        assertTrue { expected.contentEquals(result) }
    }
    @ParameterizedTest(name = "Sort input numbers between {0} and {1} using mergeSort")
    @CsvSource(
        "1,   1000",
        "1,   10000",
        "1,   100000",
        "1,   1000000",
        "1,   10000000",
    )
    fun `should sort large random array`(from: Int, to: Int) {
        val input = (from until to).shuffled().toIntArray()
        val expected = (from until to).sorted().toIntArray()

        val totalTime = measureNanoTime {
            val result = MergeSort.sort(input, input.size)
            assertTrue { expected.contentEquals(result) }
        }

        println("Completed in ${totalTime.nanoseconds.inWholeMilliseconds}ms")
    }
}
