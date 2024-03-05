import java.security.CodeSigner;
import java.util.HashMap;
import java.util.Map;

import utils.CodeUtils;

public class Question383 {
    public static void main(String[] args) {

        CodeUtils.print("res", canConstruct("a", "aab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> rMap = getNumMap(ransomNote);
        Map<Character, Integer> mMap = getNumMap(magazine);

        for (Map.Entry<Character, Integer> rEntry : rMap.entrySet()) {
            // 如果magazine中不包含ransomNote中的某个字符
            if (!mMap.containsKey(rEntry.getKey())) {
                return false;
            }

            // 如果magazine中包含ransomNote中的某个字符，但是数量比ransomNote少
            if (mMap.get(rEntry.getKey()) < rEntry.getValue()) {
                return false;
            }
        }

        return true;
    }

    /**
     * 将str转化为「字符-次数」的Map
     * @param str
     * @return
     */
    private static Map<Character, Integer> getNumMap(String str) {
        Map<Character, Integer> map = new HashMap();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
                continue;
            }
            map.put(ch, 1);
        }
        return map;
    }
}
