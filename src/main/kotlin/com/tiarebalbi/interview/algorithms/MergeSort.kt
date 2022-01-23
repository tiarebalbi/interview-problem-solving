package com.tiarebalbi.interview.algorithms

object MergeSort {
    /**
     * Merge sort implementation in Kotlin
     */
    fun sort(input: IntArray, size: Int): IntArray {
        if (size < 2) {
            return intArrayOf()
        }

        val mid: Int = size / 2
        val left = IntArray(mid)
        val right = IntArray(size - mid)

        for (index in 0 until mid) {
            left[index] = input[index]
        }
        for (index in mid until size) {
            right[index - mid] = input[index]
        }

        sort(left, mid)
        sort(right, size - mid)

        merge(input, left, right, mid, size - mid)

        return input
    }

    private fun merge(
        input: IntArray,
        leftArray: IntArray,
        rightArray: IntArray,
        left: Int,
        right: Int,
    ) {
        var i = 0
        var j = 0
        var k = 0

        while (i < left && j < right) {
            if (leftArray[i] <= rightArray[j]) {
                input[k++] = leftArray[i++]
            } else {
                input[k++] = rightArray[j++]
            }
        }

        while (i < left) {
            input[k++] = leftArray[i++]
        }
        while (j < right) {
            input[k++] = rightArray[j++]
        }
    }
}
