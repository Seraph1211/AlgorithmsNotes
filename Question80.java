// https://leetcode.cn/problems/remove-duplicates-from-sorted-array-ii/description/?envType=study-plan-v2&envId=top-interview-150

import utils.CodeUtils;

public class Question80 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        removeDuplicates(nums);
    }

    public static int removeDuplicates(int[] nums) {
        
        int[] tempArr = new int[nums.length];
        int p = 0;
        int q = 1; //计数器，记录重复数

        tempArr[0] = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == tempArr[p]) {
                if (q < 2) {
                    tempArr[++p] = nums[i];
                }
                q++;
                continue;
            }

            tempArr[++p] = nums[i];
            q = 1;
        }

        CodeUtils.printArr("Temp", tempArr);
        CodeUtils.print("length", String.valueOf(p+1));

        System.arraycopy(tempArr, 0, nums, 0, ++p);
        
    
        return p;
    }
}
