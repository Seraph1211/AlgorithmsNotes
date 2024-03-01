public class CodeUtils {
    
    public static void print(String tag, String content) {
        System.out.println(tag + ": " + content);
    }

    public static void print(String tag, int content) {
        System.out.println(tag + ": " + content);
    }

    public static void printArr(String tag, int[] arr) {
        System.out.print(tag + ": ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println("");
    }

}
