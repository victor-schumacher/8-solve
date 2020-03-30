package com.ia.solve.service

import org.junit.Assert.assertEquals
import org.junit.jupiter.api.Test

class PriorityTest {
    private val prior = Priority()
    private val board = TestBoards()

    @Test
    fun `should return hamming prior`(){

        val hammingPrior1 = prior.hamming(board.testBoard1)
        val hammingPrior2 = prior.hamming(board.testBoard2)
        val hammingPrior3 = prior.hamming(board.goalBoard)

        assertEquals(8, hammingPrior1)
        assertEquals(5, hammingPrior2)
        assertEquals(0, hammingPrior3)

    }

    @Test
    fun `should return manhattan distance`(){
        val manhattanDistance1 = prior.manhattan(board.testBoard1)
        val manhattanDistance2 = prior.manhattan(board.testBoard2)
        val manhattanDistance3 = prior.manhattan(board.goalBoard)

        assertEquals(10, manhattanDistance1)
        assertEquals(10, manhattanDistance2)
        assertEquals(0, manhattanDistance3)
    }

}