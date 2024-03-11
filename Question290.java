import java.util.HashMap;
import java.util.Map;

import utils.CodeUtils;

// https://leetcode.cn/problems/word-pattern/description/?envType=study-plan-v2&envId=top-interview-150
public class Question290 {
    public static void main(String[] args) {
        CodeUtils.print("res", wordPattern("abba", "dog cat cat fish"));
    }

    public static boolean wordPattern(String pattern, String s) {
        Map<Character, String> mapX = new HashMap<>();
        Map<String, Character> mapY = new HashMap<>();

        String[] sArr = s.split(" ");

        if (pattern.length() != sArr.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            char x = pattern.charAt(i);
            String y = sArr[i];

            if ((mapX.containsKey(x) && !mapX.get(x).equals(y))
            || (mapY.containsKey(y) && mapY.get(y) != x)) {
                return false;
            }

            mapX.put(x, y);
            mapY.put(y, x);
        }

        return true;
    }
    
}
