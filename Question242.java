import utils.CodeUtils;

// https://leetcode.cn/problems/valid-anagram/description/?envType=study-plan-v2&envId=top-interview-150
public class Question242 {

    public static void main(String[] args) {
        
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
