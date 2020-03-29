package com.ia.solve

import com.ia.solve.service.Priority
import org.junit.Assert.assertEquals
import org.junit.jupiter.api.Test

class PriorityTest {
    private val prior = Priority()

    private val testBoard1 : Array<IntArray> = arrayOf(
        intArrayOf(2, 4, 6),
        intArrayOf(1, 3, 5),
        intArrayOf(8, 7, 0)
    )

    private val testBoard2 : Array<IntArray> = arrayOf(
        intArrayOf(8, 1, 3),
        intArrayOf(4, 0, 2),
        intArrayOf(7, 6, 5)
    )

    private val testBoard3 : Array<IntArray> = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 0)
    )



    @Test
    fun `should return hamming prior`(){

        val hammingPrior1 = prior.hamming(testBoard1)
        val hammingPrior2 = prior.hamming(testBoard2)
        val hammingPrior3 = prior.hamming(testBoard3)

        assertEquals(8, hammingPrior1)
        assertEquals(5, hammingPrior2)
        assertEquals(0, hammingPrior3)

    }

    @Test
    fun `should return manhattan distance`(){
        val manhattanDistance1 = prior.manhattan(testBoard1)
        val manhattanDistance2 = prior.manhattan(testBoard2)
        val manhattanDistance3 = prior.manhattan(testBoard3)

        assertEquals(10, manhattanDistance1)
        assertEquals(10, manhattanDistance2)
        assertEquals(0, manhattanDistance3)
    }

}