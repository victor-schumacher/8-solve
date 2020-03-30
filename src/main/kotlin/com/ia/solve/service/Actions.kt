package com.ia.solve.service

class Actions {


    fun moveUp(actualBoard: Array<IntArray>): Array<IntArray>? {

        loop@ for (i in 0..2) {
            for (j in 0..2) {
                if (actualBoard[i][j] == 0) {
                    if (i == 0) {
                        return null
                    } else {
                        actualBoard[i][j] = actualBoard[i - 1][j]
                        actualBoard[i - 1][j] = 0
                        break@loop
                    }
                }
            }
        }

        return actualBoard
    }

    fun moveDown(actualBoard: Array<IntArray>): Array<IntArray>? {
        loop@ for (i in 0..2) {
            for (j in 0..2) {
                if (actualBoard[i][j] == 0) {
                    if (i == 2) {
                        return null
                    } else {
                        actualBoard[i][j] = actualBoard[i + 1][j]
                        actualBoard[i + 1][j] = 0
                        break@loop

                    }
                }
            }
        }

        return actualBoard
    }

    fun moveLeft(actualBoard: Array<IntArray>): Array<IntArray>? {
        loop@ for (i in 0..2) {
            for (j in 0..2) {
                if (actualBoard[i][j] == 0) {
                    if (j == 0) {
                        return null
                    } else {
                        actualBoard[i][j] = actualBoard[i][j - 1]
                        actualBoard[i][j - 1] = 0
                        break@loop
                    }
                }
            }
        }

        return actualBoard
    }

    fun moveRight(actualBoard: Array<IntArray>): Array<IntArray>? {
        loop@ for (i in 0..2) {
            for (j in 0..2) {
                if (actualBoard[i][j] == 0) {

                    if (j == 2) {
                        return null
                    } else {
                        actualBoard[i][j] = actualBoard[i][j + 1]
                        actualBoard[i][j + 1] = 0
                        break@loop
                    }
                }
            }
        }

        return actualBoard
    }

}