package com.ia.solve.service

import kotlin.math.abs

class Priority {

    val goalBoard: Array<IntArray> = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 0)
    )

    fun hamming(actualBoard: Array<IntArray>): Int {
        var hammingResult = 0

        for (i in 0..2) {
            for (j in 0..2) {
                if (actualBoard[i][j] != 0 && actualBoard[i][j] != goalBoard[i][j]) {
                    hammingResult++
                }
            }
        }

        return hammingResult
    }

    fun manhattan(actualBoard: Array<IntArray>): Int {
        var manhattanResult = 0
        for (i in 0..2) {
            for (j in 0..2) {
                when (actualBoard[i][j]) {
                    1 -> manhattanResult += i + j
                    2 -> manhattanResult += i + abs(1 - j)
                    3 -> manhattanResult += i + abs(2 - j)
                    4 -> manhattanResult += abs(1 - i) + j
                    5 -> manhattanResult += abs(1 - i) + abs(1 - j)
                    6 -> manhattanResult += abs(1 - i) + abs(2 - j)
                    7 -> manhattanResult += abs(2 - i) + j
                    8 -> manhattanResult += abs(2 - i) + abs(1 - j)
                }
            }
        }

        return manhattanResult
    }


}