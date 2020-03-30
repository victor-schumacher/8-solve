package com.ia.solve.service

class TestBoards {
    val testBoard1: Array<IntArray> = arrayOf(
        intArrayOf(2, 4, 6),
        intArrayOf(1, 3, 5),
        intArrayOf(8, 7, 0)
    )

    val testBoard2: Array<IntArray> = arrayOf(
        intArrayOf(8, 1, 3),
        intArrayOf(4, 0, 2),
        intArrayOf(7, 6, 5)
    )

    val goalBoard: Array<IntArray> = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 0)
    )

    val cannotMoveUpBoard: Array<IntArray> = arrayOf(
        intArrayOf(1, 0, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 2)
    )

    val movedUpBoard: Array<IntArray> = arrayOf(
        intArrayOf(8, 0, 3),
        intArrayOf(4, 1, 2),
        intArrayOf(7, 6, 5)
    )

    val cannotMoveDownBoard: Array<IntArray> = arrayOf(
        intArrayOf(1, 8, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(0, 7, 2)
    )

    val movedDownBoard: Array<IntArray> = arrayOf(
        intArrayOf(8, 1, 3),
        intArrayOf(4, 6, 2),
        intArrayOf(7, 0, 5)
    )

    val cannotMoveLeftBoard: Array<IntArray> = arrayOf(
        intArrayOf(1, 4, 3),
        intArrayOf(0, 5, 6),
        intArrayOf(7, 8, 2)
    )

    val movedLeftBoard: Array<IntArray> = arrayOf(
        intArrayOf(8, 1, 3),
        intArrayOf(0, 4, 2),
        intArrayOf(7, 6, 5)
    )

    val cannotMoveRightBoard: Array<IntArray> = arrayOf(
        intArrayOf(1, 6, 3),
        intArrayOf(4, 5, 0),
        intArrayOf(7, 8, 2)
    )

    val movedRightBoard: Array<IntArray> = arrayOf(
        intArrayOf(8, 1, 3),
        intArrayOf(4, 2, 0),
        intArrayOf(7, 6, 5)
    )
}