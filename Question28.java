import utils.CodeUtils;

// https://leetcode.cn/problems/find-the-index-of-the-first-occurrence-in-a-string/description/?envType=study-plan-v2&envId=top-interview-150
public class Question28 {
    public static void main(String[] args) {
        String haystack = "ssippi", needle = "sipp";
        //String haystack = "letcode", needle = "code";
        CodeUtils.print("res", strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) != needle.charAt(0)) {
                continue;
            }

            for (int j = 0, p = i; j < needle.length() && p < haystack.length(); j++, p++) {
                if (haystack.charAt(p) == needle.charAt(j) 
                && j == needle.length() - 1) {
                    return i;
                }

                if (haystack.charAt(p) != needle.charAt(j) 
                && j != needle.length() - 1) {
                    break;
                }
            }
        }

        return -1;
    }

    public static int strStrKMP(String haystack, String needle) {

        return -1;

    }
}
