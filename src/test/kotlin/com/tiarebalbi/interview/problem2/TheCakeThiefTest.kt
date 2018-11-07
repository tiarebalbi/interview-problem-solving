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

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TheCakeThiefTest {

  /**
   * returns 555 (6 of the middle type of cake and 1 of the last type of cake)
   */
  @Test
  fun `test case 1`() {
    val cakeTypes = arrayOf(Cake(7, 160), Cake(3, 90), Cake(2, 15))

    val result = TheCakeThief(cakeTypes, 20).maxDuffelBagValue()
    assertEquals(result, 555)
  }

  /**
   * With our approach, we’ll put in two of the second type of cake for a total value of 400 pounds. But
   * we could have put in a hundred of the first type of cake, for a total of 3000 pounds!
   */
  @Test
  fun `test case 2`() {
    val cakeTypes = arrayOf(Cake(1, 30), Cake(50, 200))

    val result = TheCakeThief(cakeTypes, 100).maxDuffelBagValue()
    assertEquals(result, 3000)
  }

  /**
   * If our capacity is 8 kg, no problem. Our algorithm chooses one of each cake, giving us a haul
   * worth 110 pounds, which is optimal.
   */
  @Test
  fun `test case 3`() {
    val cakeTypes = arrayOf(Cake(3, 40), Cake(5, 70))

    val result = TheCakeThief(cakeTypes, 8).maxDuffelBagValue()
    assertEquals(result, 110)
  }

  /**
   * But if the capacity is 9 kg, we’re in trouble. Our algorithm will again choose one of each cake, for a
   * total value of 110 pounds. But the actual optimal value is 120 pounds—three of the first type of cake!
   */
  @Test
  fun `test case 4`() {
    val cakeTypes = arrayOf(Cake(3, 40), Cake(5, 70))

    val result = TheCakeThief(cakeTypes, 9).maxDuffelBagValue()
    assertEquals(result, 120)
  }
}