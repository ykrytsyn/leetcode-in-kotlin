package leetcode


/**
 * # 1346. Check If N and Its Double Exist
 * [https://leetcode.com/problems/check-if-n-and-its-double-exist/)
 *
 * ### Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).
 *
 * More formally check if there exists two indices i and j such that :
 * -  i != j
 * -  0 <= i, j < arr.length
 * -  arr[i] == 2 * arr[j]
 */
class CheckIfNAndItsDoubleExist {

    fun checkIfExists(nums: IntArray): Boolean {
        val set: MutableSet<Int> = HashSet()

        for (n in nums) {
            if (set.contains(n * 2)) {
                return true
            } else if (n % 2 == 0 && set.contains(n / 2)) {
                return true
            }
            set.add(n)
        }
        return false
    }
}
