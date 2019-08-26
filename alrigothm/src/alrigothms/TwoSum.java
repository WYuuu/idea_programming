package alrigothms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * @Author: WY
 * @Date: 2019/8/23 12:40
 *
 * 解题思路：遍历数组 nums，i为当前下标。每个值都判断 map 中是否存在 target - nums[i]的 key 值
 * 如果存在则找到了两个值，如果不存在，则将当前的nums[i],i放入map中，继续遍历，知道找到为止。
 * 如果最终没能找到，则抛出异常。
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int desired = target - nums[i];
            if (map.containsKey(desired)){
                return new int[] {map.get(desired), i};
            }else {
                map.put(nums[i], i);
            }
        }
        return new int[2];
    }

}
