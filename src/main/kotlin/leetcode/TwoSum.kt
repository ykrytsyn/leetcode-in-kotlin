package leetcode


/**
 * # 1. Two Sum
 * [https://leetcode.com/problems/two-sum/](https://leetcode.com/problems/two-sum/)
 *
 * ### Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * ### You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * ### You can return the answer in any order.
 *
 */
class TwoSum {

    /**
     * Brute Force
     */
    fun bruteForce(nums: IntArray, target: Int): IntArray? {
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                if (nums[j] == target - nums[i]) {
                    return intArrayOf(i, j)
                }
            }
        }
        // In case there is no solution, we'll just return null
        return null
    }

    /**
     * Two-pass Hash Table
     */
    fun twoPassHashTable(nums: IntArray, target: Int): IntArray? {
        val map: MutableMap<Int, Int> = HashMap()
        for (i in nums.indices) {
            map[nums[i]] = i
        }
        for (i in nums.indices) {
            val complement = target - nums[i]
            if (map.containsKey(complement) && map[complement] != i) {
                return intArrayOf(i, map[complement]!!)
            }
        }
        // In case there is no solution, we'll just return null
        return null
    }

    /**
     * One-pass Hash Table
     */
    fun onePassHashTable(nums: IntArray, target: Int): IntArray? {
        val map: MutableMap<Int, Int> = HashMap()
        for (i in nums.indices) {
            val complement = target - nums[i]
            if (map.containsKey(complement)) {
                return intArrayOf(map[complement]!!, i)
            }
            map[nums[i]] = i
        }
        // In case there is no solution, we'll just return null
        return null
    }

}
