import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import utils.CodeUtils;

public class Question1 {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        CodeUtils.printArr("res", twoSum(nums, 6));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
          if (hashMap.containsKey(target - nums[i])) { //如果当前位置的数据和map中已有数据之和等于target
            return new int[] {hashMap.get(target - nums[i]), i};
          }

          hashMap.put(nums[i], i); //填充map
        }

        return new int[0];
    }
}
