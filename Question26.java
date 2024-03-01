// https://leetcode.cn/problems/remove-duplicates-from-sorted-array/?envType=study-plan-v2&envId=top-interview-150
public class Question26 {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicatesNew(nums);
        CodeUtils.printArr("final nums", nums);
    }


    public static int removeDuplicates(int[] nums) {

        // 最后要考虑极端情况

        int[] resArr = new int[nums.length];

        //int i = 1; //源数组指针
        int j = 0; //结果数组指针
        int temp = nums[0]; 
        resArr[0] = temp;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == temp) {
                continue;
            }

            resArr[++j] = nums[i];
            temp = nums[i];
        }

        CodeUtils.printArr("resArr", resArr);
        System.arraycopy(resArr, 0, nums, 0, ++j);

        CodeUtils.printArr("nums in func", nums);
        CodeUtils.print("j", String.valueOf(j));

        return j;
    }

    public static int removeDuplicatesNew(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        int i = 0, j = 1;

        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                j++;
                continue;
            }

            nums[i+1] = nums[j++];
            i++;
        }

        CodeUtils.printArr("nums in func", nums);
        CodeUtils.print("i", String.valueOf(i));

        return i+1;

    }
}
