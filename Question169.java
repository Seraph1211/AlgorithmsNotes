import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://leetcode.cn/problems/majority-element/description/?envType=study-plan-v2&envId=top-interview-150
public class Question169 {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        CodeUtils.print("result", majorityElementWay3(nums));
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int res = nums[0], cnt = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                cnt++;
            } else {
                cnt = 1;
            }

            if (cnt > nums.length/2) {
                res = nums[i];
                break;
            }
        }

        return res;
    }

    public static int majorityElementWay2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public static int majorityElementWay3(int[] nums) {
        // 将nums中的元素及其出现次数作为kv放入Map中
        Map<Integer, Integer> cntMap = getCntMap(nums);

        // 遍历Map找到出现次数最多的元素
        Map.Entry<Integer, Integer> resultEntry = null;
        for (Map.Entry<Integer, Integer> entry : cntMap.entrySet()) {
            if (resultEntry == null || resultEntry.getValue() < entry.getValue()) {
                resultEntry = entry;
            }
        }

        return resultEntry.getKey();
    }

    private static Map<Integer, Integer> getCntMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int element : nums) {
            if (map.containsKey(element)) {
                map.put(element, map.get(element)+1);
                continue;
            }
            map.put(element, 1);
        }

        return map;
    }

}
