import utils.CodeUtils;

// https://leetcode.cn/problems/roman-to-integer/description/?envType=study-plan-v2&envId=top-interview-150
public class Question13 {
    public static void main(String[] args) {
        CodeUtils.print("res", romanToInt("MCMXCIV"));
    }

    private static int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length()-1; i++) {
            int curNum = revert(s.charAt(i));
            int nextNum = revert(s.charAt(i+1));
            if (curNum >= nextNum) {
                result += curNum;
                continue;
            }
            result -= curNum;
        }
        result += revert(s.charAt(s.length()-1));
        return result;
    }

    private static int revert(char ch) {
        int num = 0;
        switch (ch) {
            case 'I':
                num = 1;
                break;
            case 'V':
                num = 5;
                break;
            case 'X':
                num = 10;
                break;
            case 'L':
                num = 50;
                break;
            case 'C':
                num = 100;
                break;
            case 'D':
                num = 500;
                break;
            case 'M':
                num = 1000;
                break;
            default:
                break;
        }
        return num;
    }
}
