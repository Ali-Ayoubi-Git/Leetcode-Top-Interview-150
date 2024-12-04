package LeetCode.RemoveElement.kotlin

class Solution {
    fun removeElement(nums: IntArray, `value`: Int): Int {
        var iw = 0
        var ir = 0
        var k = 0

        while (ir < nums.size) {
            if (nums[ir] != value) {
                k++
                nums[iw] = nums[ir]
                iw++
            }
            ir++
        }
        return k
    }
}