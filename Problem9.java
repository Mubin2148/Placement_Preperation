
public class Problem9 {
    public static int findMinimum(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = { 3, 4, 5, 0, 1, 2 };
        System.out.println("The number of rotations is: " + findMinimum(nums));
    }
}
