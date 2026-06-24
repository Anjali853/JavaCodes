import java.util.Arrays;

class New {
    public void nextPermutation(int[] nums) {

        int n = nums.length;
        int i = n - 2;

        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {

            int j = n - 1;

            while (nums[j] <= nums[i]) {
                j--;
            }

            swap(nums, i, j);
        }

        reverse(nums, i + 1, n - 1);
    }

    public void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums, int start, int end) {

        while (start < end) {

            swap(nums, start, end);

            start++;
            end--;
        }
    }
    public static void main(String[] args) {

        New obj = new New();

        int[] nums = {1, 2, 3};

        obj.nextPermutation(nums);

        System.out.println(Arrays.toString(nums));
    }
}