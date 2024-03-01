import utils.CodeUtils;

// https://leetcode.cn/problems/length-of-last-word/description/?envType=study-plan-v2&envId=top-interview-150
public class Question58 {
    public static void main(String[] args) {
        CodeUtils.print("res", lengthOfLastWord("luffy is still joyboy"));
    }

    private static int lengthOfLastWord(String s) {
        int len = 0;
        for (int i = s.length() - 1; i >=0; i--) {
            if (s.charAt(i) != ' ') {
                len++;
                continue;
            }

            if (s.charAt(i) == ' ' && len > 0) {
                return len;
            }
            
        }
        return len;
    }
}
