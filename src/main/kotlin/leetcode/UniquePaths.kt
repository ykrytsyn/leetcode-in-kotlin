package leetcode

/**
 * # Problem 62
 * [https://leetcode.com/problems/unique-paths/](https://leetcode.com/problems/unique-paths/)
 *
 * ### A robot is located at the top-left corner of 'm x n' grid (marked 'Start' in the diagram below).
 * ### The robot can only move either down or right at any point in time.
 * ### The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 *
 * ### How many possible unique paths are there?
 *
 */
class UniquePaths {

    fun dynamicProgramming(m: Int, n: Int): Int {
        val grid: Array<IntArray> = Array(m) { IntArray(n) }

        for (i in m - 1 downTo 0) {
            for (j in n - 1 downTo 0) {
                if (i == m - 1 || j == n - 1) {
                    grid[i][j] = 1
                } else {
                    grid[i][j] = grid[i + 1][j] + grid[i][j + 1]
                }
            }
        }

        return grid[0][0];
    }

    fun recursive(m: Int, n: Int): Int {
        if (m == 1 || n == 1) {
            return 1
        }

        return recursive(m - 1, n) + recursive(m, n - 1)
    }
}
