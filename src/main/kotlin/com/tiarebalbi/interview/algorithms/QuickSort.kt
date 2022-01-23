package com.tiarebalbi.interview.algorithms

object QuickSort {

    fun sort(input: IntArray, leftIndex: Int, rightIndex: Int): IntArray {
        if (leftIndex >= rightIndex) {
            return input
        }

        val partition: Int = createPartition(input, leftIndex, rightIndex)

        sort(input, leftIndex, partition - 1)
        sort(input, partition + 1, rightIndex)

        return input
    }

    private fun createPartition(input: IntArray, leftIndex: Int, rightIndex: Int): Int {
        val pivot = input[rightIndex]

        var movingIndex = leftIndex - 1

        for (j in leftIndex until rightIndex) {
            if (input[j] < pivot) {
                ++movingIndex
                input.swapInPlace(movingIndex, j)
            }
        }

        input.swapInPlace(movingIndex + 1, rightIndex)

        return movingIndex + 1
    }

    /**
     * Swap the position of element A with element B.
     */
    private fun IntArray.swapInPlace(i1: Int, i2: Int) {
        this[i1] = this[i2].also { this[i2] = this[i1] }
    }
}
