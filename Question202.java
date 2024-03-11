import utils.CodeUtils;

// https://leetcode.cn/problems/happy-number/description/?envType=study-plan-v2&envId=top-interview-150
public class Question202 {
    public static void main(String[] args) {
        CodeUtils.print("isHappy", isHappy(19));
    }

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = getNextNum(n);
        while (slow != 1 && fast != slow) {
            slow = getNextNum(slow);
            fast = getNextNum(getNextNum(fast));
        }

        return slow == 1;
    }

    private static int getNextNum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10) * (n % 10);
            n = n/10;
        }
        return sum;
    }
}
