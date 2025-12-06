import java.util.Arrays;
class threeSumClosest {

    public int threeSumClosest(int[] nums, int target) {
     
    
        Arrays.sort(nums);
        int n = nums.length;

        int closestSum = nums[0] + nums[1] + nums[2]; // initial best

        for (int i = 0; i < n - 2; i++) {
            int l = i + 1;
            int r = n - 1;

            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];

                // If this sum is closer to target, update it
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }

                if (sum == target) {
                    return sum;  // Best possible match
                } else if (sum < target) {
                    l++;
                } else {
                    r--;
                }
            }
        }

        return closestSum;
    }

    // Quick test
    public static void main(String[] args) {
      threeSumClosest   obj = new threeSumClosest();

        int[] nums1 = {-1, 2, 1, -4};
        System.out.println(obj.threeSumClosest(nums1, 1)); // Output: 2

        int[] nums2 = {0, 0, 0};
        System.out.println(obj.threeSumClosest(nums2, 1)); // Output: 0
    }
}