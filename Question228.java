import java.util.ArrayList;
import java.util.List;

import utils.CodeUtils;

public class Question228 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        CodeUtils.print("res", summaryRanges(nums).toString());
    }

    // 0,2,3,4,6,8,9
    
    public static List<String> summaryRanges(int[] nums) {
        List<String> arr = new ArrayList<>();
        int len = nums.length;
        
        for (int i = 0; i < len;) {
            int slow = i, fast = i + 1;
            while (slow < len && fast < len 
            && nums[fast] - nums[slow] == 1) {
                slow++;
                fast++;
            }

            if (slow == i) {
                arr.add(String.valueOf(nums[i]));
            } else {
                arr.add(nums[i] + "->" + nums[slow]);
            }

            i = fast;
        }

        return arr;
    }
}
