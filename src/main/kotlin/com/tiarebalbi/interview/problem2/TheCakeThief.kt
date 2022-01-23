/*
 * Copyright 2018 @tiarebalbi
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.tiarebalbi.interview.problem2

import org.apache.logging.log4j.LogManager
import kotlin.math.max

/**
 * The Cake Thief
 *
 * @author Tiare Balbi Bonamini
 */
class TheCakeThief constructor(private val cakes: Array<Cake>, private val capacity: Int) {

    private val logger = LogManager.getLogger()

    fun maxDuffelBagValue(): Int {
        val maxValueAtCapacity = IntArray(capacity + 1)

        for (i in 0..capacity) {
            var currentMaxValue = 0

            for (j in cakes.indices) {
                val cake = cakes[j]
                if (cake.weight <= i) {
                    val maxValueUsingCake = cake.worth + maxValueAtCapacity[i - cake.weight]

                    currentMaxValue = max(maxValueUsingCake, currentMaxValue)
                }
            }

            maxValueAtCapacity[i] = currentMaxValue
        }

        val result = maxValueAtCapacity[capacity]

        logger.info("maxDuffelBagValue: $result with a capacity of $capacity with cakes ${cakes.toList()}")

        return result
    }
}
