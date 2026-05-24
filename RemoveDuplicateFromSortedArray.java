public class RemoveDuplicateFromSortedArray {

    public static int removeDuplicates(int[] nums) {

        // nums = [0,0,1,1,1,2,2,3,3,4]

        int j = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > nums[j]) {

                j++;

                nums[j] = nums[i];
            }
        }

        return j + 1;

    }

    public static void main(String args[]) {

        int[] arr = { 1, 1, 1, 1, 2, 3, 4, 6 };
        System.out.print("the number of unique elements are " + removeDuplicates(arr));

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}
