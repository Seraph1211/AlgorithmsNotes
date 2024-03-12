import java.util.Stack;

import utils.CodeUtils;

// https://leetcode.cn/problems/valid-parentheses/description/?envType=study-plan-v2&envId=top-interview-150
public class Question20 {
    public static void main(String[] args) {
        String s = "){";
        CodeUtils.print("res", isValid(s));
    }

    public static boolean isValid(String s) {
        int len = s.length();
        if (len % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }

            char chTop = stack.pop();
            switch (ch) {
                case ')':
                    if (chTop != '(') {
                        return false;
                    }
                    break;
                    
                case ']':
                    if (chTop != '[') {
                        return false;
                    }
                    break;
                    
                case '}':
                    if (chTop != '{') {
                        return false;
                    }
                    break;

                default:
                    return false;
            }
        }

        if (!stack.isEmpty()) {
            return false;
        }
        
        return true;
    }

}
