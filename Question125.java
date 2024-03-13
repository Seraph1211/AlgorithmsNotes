import utils.CodeUtils;

public class Question125 {
    public static void main(String[] args) {
        CodeUtils.print("result", isPalindrome("A man, a plan, a canal: Panama"));
    }


    public static boolean isPalindrome(String s) {
        // 规范字符串
        //String formatStr = (s.replaceAll("[^a-zA-Z0-9]", "")).toLowerCase();
        

        StringBuffer sp = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                sp.append(s.charAt(i));
            }
        }

        String formatStr = sp.toString();
        CodeUtils.print("result", formatStr);

        int len = formatStr.length();
        int i = 0, j = len - 1;
        while (i < j) {
            if (Character.toLowerCase(formatStr.charAt(i)) == Character.toLowerCase(formatStr.charAt(j))) {
                i++;
                j--;
                continue;
            }
            return false;
        }

        return true;
    }
}
