//给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重
//复的三元组。 
//
// 注意：答案中不可以包含重复的三元组。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [-1,0,1,2,-1,-4]
//输出：[[-1,-1,2],[-1,0,1]]
// 
//
// 示例 2： 
//
// 
//输入：nums = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：nums = [0]
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 3000 
// -10⁵ <= nums[i] <= 10⁵ 
// 
// Related Topics 数组 双指针 排序 👍 3689 👎 0


package leetcode.editor.cn;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        Solution solution = new ThreeSum().new Solution();
        solution.threeSum(new int[]{3, 0, -2, -1, 1, 2});
    }

    // a + b + c = 0 , a + b = -c

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            Set<List<Integer>> lists = new LinkedHashSet<>();
            for (int k = 0; k < nums.length - 2; k++) {
                for (int i = k + 1, j = nums.length - 1; i < j; ) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum < 0) {
                        i++;
                    } else if (sum > 0) {
                        j--;
                    } else {
                        lists.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        i++;
                        j--;
                    }
                }
            }
            return new ArrayList<>(lists);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

    // 1暴力
//    Arrays.sort(nums);
//    Set<List<Integer>> lists = new LinkedHashSet<>();
//            for (int i = 0; i < nums.length - 2; i++) {
//        for (int j = i + 1; j < nums.length - 1; j++) {
//            for (int k = j + 1; k < nums.length; k++) {
//                if (nums[i] + nums[j] + nums[k] == 0) {
//                    List<Integer> integers = new ArrayList<>();
//                    integers.add(nums[i]);
//                    integers.add(nums[j]);
//                    integers.add(nums[k]);
//                    lists.add(integers);
//                }
//            }
//        }
//    }
//            return new ArrayList<>(lists);

    // 2夹逼
}