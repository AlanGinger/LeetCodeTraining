//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。 
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。 
//
// 
//
// 示例: 
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
// 
// Related Topics 数组 哈希表 
// 👍 9436 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val numsMap = hashMapOf<Int, Int>()
        for (i in nums.indices) {
            if (numsMap.containsKey(target - nums[i])){
                return intArrayOf(numsMap[target - nums[i]]!!, i)
            }
            numsMap[nums[i]] = i
        }
        return intArrayOf()
    }
}
//leetcode submit region end(Prohibit modification and deletion)
