import utils.CodeUtils;

// https://leetcode.cn/problems/longest-common-prefix/description/?envType=study-plan-v2&envId=top-interview-150
public class Question14 {
    public static void main(String[] args) {

        String[] strs = {""};
        CodeUtils.print("res", longestCommonPrefix(strs));
        //CodeUtils.print("loop", "minLen=" + minLen + ", str[i]=" + strs[i] + ", str[i].len=" + strs[i].length());

    }

    private static String longestCommonPrefix(String[] strs) {
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            minLen = minLen > strs[i].length() ? strs[i].length() : minLen;
        }

        CodeUtils.print("minLen", minLen);

        StringBuilder spRes = new StringBuilder();
        for (int p = 0; p < minLen; p++) {
            for (int j = 0; j < strs.length - 1; j++) {
                if (strs[j].charAt(p) != strs[j+1].charAt(p)) {
                    return spRes.toString();
                }
            }
            spRes.append(strs[0].charAt(p));
        }
        return spRes.toString();
    }
}
