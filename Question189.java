// https://leetcode.cn/problems/rotate-array/description/?envType=study-plan-v2&envId=top-interview-150

import utils.CodeUtils;

public class Question189 {
    public static void main(String[] args) {
        int[] nums = {-1,-100,3,99};
        int k = 2;
        rotate(nums, k);
    }

    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] resArr = new int[len];
    
        for (int i = 0; i < len; i++) {
            resArr[(i+k) % len] = nums[i];
        }
        CodeUtils.printArr("nums", nums);
        CodeUtils.printArr("resArr", resArr);

        System.arraycopy(resArr, 0, nums, 0, len);
        CodeUtils.printArr("final nums", nums);
    }
}
