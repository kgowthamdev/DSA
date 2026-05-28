import java.util.Arrays;

public class Mergesort {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = 0;
        int p2 = 0;
        int[] n1cpy = Arrays.copyOfRange(nums1, 0, m);
        for (int i = 0; i < m + n; i++) {
            // int[] arr1 = { 1, 6, 7};
            // int[] arr2 = { 3, 4, 5 };
            if (p2 >= n || p1 < m && n1cpy[p1] < nums2[p2]) {

                nums1[i] = n1cpy[p1];
                p1++;
            } else {
                nums1[i] = nums2[p2];
                p2++;
            }

        }

    }

    public static void main(String[] args) {

        int[] arr1 = { 1, 6, 7, 0, 0, 0 };
        int[] arr2 = { 3, 4, 5 };
        int m = 3;
        int n = 3;

        merge(arr1, m, arr2, n);

        for (int i = 0; i < m + n; i++) {
            System.out.println(arr1[i]);
        }

    }

}
