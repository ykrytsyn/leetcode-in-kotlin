package leetcode

/**
 * # 441. Arranging Coins
 * [https://leetcode.com/problems/arranging-coins/](https://leetcode.com/problems/arranging-coins/)
 *
 * ### You have n coins and you want to build a staircase with these coins.
 * ### The staircase consists of k rows where the ith row has exactly i coins.
 * ### The last row of the staircase may be incomplete.
 * ### Given the integer n, return the number of complete rows of the staircase you will build.
 *
 * ### Constraints:
 *   1 <= n <= 2^31 - 1
 */
class ArrangingCoins {

    /**
     * Brute force solution: checking every step one by one while we have enough coins for step's capacity
     */
    fun bruteForce(n: Int): Int {
        var coins = n
        if (coins <= 1) {
            return coins
        }
        var completedSteps = 0
        var currentStep = 1
        while (currentStep <= coins) {
            completedSteps = currentStep
            coins -= currentStep
            currentStep++
        }
        return completedSteps
    }

    /**
     * Find the maximum K such that (K*(K+1))/2 <= N
     * Using Long type due to constraints
     */
    fun binarySearch(n: Int): Int {
        var left: Long = 0
        var right = n.toLong()
        var k: Long
        var curr: Long
        while (left <= right) {
            k = left + (right - left) / 2
            curr = k * (k + 1) / 2
            if (curr == n.toLong()) {
                return k.toInt()
            }
            if (n < curr) {
                right = k - 1
            } else {
                left = k + 1
            }
        }
        return right.toInt()
    }
}
