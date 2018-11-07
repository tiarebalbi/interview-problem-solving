/*
 * Copyright 2018 @tiarebalbi
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.tiarebalbi.interview.problem1

import org.apache.log4j.Logger

class TwoEggProblem constructor(
  val numberOfFloors: Int,
  val theSafeFloorToDrop: Int = (1..numberOfFloors).random()
) {

  private val logger = Logger.getLogger("TwoEggProblem")
  private val floors: List<Int> = IntRange(1, numberOfFloors).toList().sorted()

  private val firstEgg: MutableList<Int> = mutableListOf()
  private val secondEgg: MutableList<Int> = mutableListOf()

  fun whichFloorIsSafeToDropTheEgg(): Int {
    val result = search(floors, theSafeFloorToDrop, 1, numberOfFloors)

    logger.info("Highest floor an egg won't break from: $result")
    logger.info("Floors we drop first egg from: $firstEgg")
    logger.info("Floors we drop second egg from: $secondEgg")
    logger.info("Total number of drops: ${firstEgg.size + secondEgg.size}")

    return result
  }


  private fun search(
    data: List<Int>,
    safeFloorToDrop: Int,
    lowestNumber: Int,
    highestNumber: Int,
    brokenTheEgg: Boolean = false
  ): Int {
    if (highestNumber < lowestNumber || safeFloorToDrop > highestNumber) return -1

    val middleOrHighestNumber = if (brokenTheEgg) highestNumber else (lowestNumber + highestNumber) / 2

    val valueToCompareAgainst = if (brokenTheEgg) lowestNumber else middleOrHighestNumber

    if (brokenTheEgg) {
      secondEgg.add(valueToCompareAgainst)
    } else {
      firstEgg.add(valueToCompareAgainst)
    }

    return when {
      safeFloorToDrop == data[valueToCompareAgainst] -> {
        data[valueToCompareAgainst]
      }
      (safeFloorToDrop > data[valueToCompareAgainst]) && !brokenTheEgg -> search(data, safeFloorToDrop, middleOrHighestNumber + 1, highestNumber)
      else -> {
        val newLowest = if (brokenTheEgg) lowestNumber + 1 else lowestNumber
        search(data, safeFloorToDrop, newLowest, middleOrHighestNumber, true)
      }
    }
  }
}