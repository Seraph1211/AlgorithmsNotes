package utils;
public class CodeUtils {
    
    public static void print(String tag, String content) {
        System.out.println(tag + ": " + content);
    }

    public static void print(String tag, int content) {
        System.out.println(tag + ": " + content);
    }

    public static void print(String tag, boolean content) {
        System.out.println(tag + ": " + content);
    }

    public static void printArr(String tag, int[] arr) {
        System.out.print(tag + ": ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println("");
    }

    public static void printArr(String tag, String[] arr) {
        System.out.print(tag + ": ");
        for (String element : arr) {
            System.out.print(element + " ");
        }
        System.out.println("");
    }

}
