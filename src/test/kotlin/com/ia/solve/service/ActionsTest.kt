package com.ia.solve.service

import org.junit.jupiter.api.Test
import org.junit.Assert.assertNull
import org.junit.Assert.assertArrayEquals

class ActionsTest {

    private val board = TestBoards()
    private val action = Actions()

    @Test
    fun`should move up`(){
        val movedUpBoard = action.moveUp(board.testBoard2)

        assertArrayEquals(movedUpBoard, board.movedUpBoard)
    }

    @Test
    fun`should not move up`(){
        val tryBoard = action.moveUp(board.cannotMoveUpBoard)

        assertNull(tryBoard)
    }

    @Test
    fun`should move down`(){
        val movedDownBoard = action.moveDown(board.testBoard2)

        assertArrayEquals(movedDownBoard, board.movedDownBoard)

    }

    @Test
    fun`should not move down`(){
        val tryBoard = action.moveDown(board.cannotMoveDownBoard)

        assertNull(tryBoard)
    }

    @Test
    fun`should move left`(){
        val movedLeftBoard = action.moveLeft(board.testBoard2)

        assertArrayEquals(movedLeftBoard, board.movedLeftBoard)
    }

    @Test
    fun`should not move left`(){
        val tryBoard = action.moveLeft(board.cannotMoveLeftBoard)

        assertNull(tryBoard)
    }

    @Test
    fun`should move right`(){
        val movedRightBoard = action.moveRight(board.testBoard2)

        assertArrayEquals(movedRightBoard, board.movedRightBoard)
    }

    @Test
    fun`should not move right`(){
        val tryBoard = action.moveRight(board.cannotMoveRightBoard)

        assertNull(tryBoard)
    }


}