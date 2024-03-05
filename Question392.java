import utils.CodeUtils;

// https://leetcode.cn/problems/is-subsequence/description/?envType=study-plan-v2&envId=top-interview-150
public class Question392 {
    
    public static void main(String[] args) {
        CodeUtils.print("res", isSubsequence("aaaaaa", "bbaaaa"));
    }

    public static boolean isSubsequence(String s, String t) {

        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean isFinded = false;
            while (j < t.length()) {
                if (t.charAt(j) != ch) {
                    j++;
                    continue;
                }
                isFinded = true;
                break;
            }

            if (!isFinded) {
                return false;
            }

            // 如果找到了，但是该字符不是s串的最后一个又是t串的最后一个，则说明s不是t的子序列
            if (isFinded && i < s.length() - 1 && j == t.length() - 1) {
                return false;
            }

            j++; //如果找到了字符，则从t串当前字符的下一个位置继续搜索
        }

        return true;
    }
}
