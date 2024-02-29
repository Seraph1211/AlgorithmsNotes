import java.util.Arrays;

// https://leetcode.cn/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
public class Question28 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,2,0};
        int[] arr2 = {2,5,6};

        merge(arr1, 3, arr2, 3);
        
        for (int e : arr1) {
            System.out.print(e + " ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0; //nums1的指针
        int j = 0; //nums2的指针

        // 将nums1的内容copy到temp中
        int[] temp = new int[m];
        System.arraycopy(nums1, 0, temp, 0, m);

        for (int p = 0; p < m + n; p++) {
            if (temp[i] < nums2[j]) {
                nums1[p] = temp[i++];
            }
        }
    }

    private static void printArr(String tag, int[] arr) {
        System.out.print(tag + ": ");
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println("");
    }
}