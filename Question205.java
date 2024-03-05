import java.security.CodeSigner;
import java.util.HashMap;
import java.util.Map;

import utils.CodeUtils;

// https://leetcode.cn/problems/isomorphic-strings/description/?envType=study-plan-v2&envId=top-interview-150
public class Question205 {
    
    public static void main(String[] args) {
        CodeUtils.print("res", isIsomorphic("badc", "baba"));
    }

    public static boolean isIsomorphic(String s, String t) {
        // if (s.length() != t.length()) {
        //     return false;
        // }

        Map<Character, Character> mapX = new HashMap<>();
        Map<Character, Character> mapY = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i), y = t.charAt(i);

            if ((mapX.containsKey(x) && mapX.get(x) != y)
            || (mapY.containsKey(y) && mapY.get(y) != x)) {
                return false;
            }

            mapX.put(x, y);
            mapY.put(y, x);
        }

        return true;
    }
}
