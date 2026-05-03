import java.util.Arrays;

class ARRAY {
    // public int[] twoSum(int[] nums, int target) {
    //     for (int i = 0; i < nums.length; i++) {
    //         for (int j = i + 1; j < nums.length; j++) {
    //             if (nums[i] + nums[j] == target) {
    //                 return new int[]{i, j};
    //             }
    //         }
    //     }
    //     return new int[]{};
    // }
    //     public static void main(String[] args) {
    //     ARRAY sol = new ARRAY();
    //     int[] nums = {2,7,11,15};
    //     int target = 9;
    //     System.out.println(Arrays.toString(sol.twoSum(nums, target)));
    // }


    // public int maxSubArray(int[] nums){
    //     int currentSum = nums[0];
    //     int maxSum = nums[0];

    //     for (int i = 1; i <nums.length; i++){
    //         currentSum = Math.max(nums[i], currentSum + nums[i]);
    //         maxSum = Math.max(maxSum, currentSum);
    //     }
    //     return maxSum;
    // }

    // public static void main(String[] args) {
    //     ARRAY sol = new ARRAY();
    //     int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
    //     System.out.println(sol.maxSubArray(nums));

    // }


    
    // public int maxProfit(int[] prices) {
    //     int minPrice = Integer.MAX_VALUE;
    //     int maxProfit = 0;

    //     for (int price : prices) {
    //         if (price < minPrice) {
    //             minPrice = price;   // नया minimum मिला
    //         } else {
    //             maxProfit = Math.max(maxProfit, price - minPrice);
    //         }
    //     }
    //     return maxProfit;
    // }

    // public static void main(String[] args) {
    //    ARRAY sol = new ARRAY();
    //     int[] prices = {7,1,5,3,6,4};
    //     System.out.println(sol.maxProfit(prices)); // Output: 5
    // }

   // }

//    public void moveZeroes(int[] nums){
//     int lastNonZeroIndex = 0;

//     for(int i = 0; i < nums.length; i++) {
//         if (nums[i] !=0){
//             nums[lastNonZeroIndex] = nums[i];
//             lastNonZeroIndex++;
//         }
//     }

//     for (int i = lastNonZeroIndex; i < nums.length; i++){
//         nums[i] = 0;
//     }
//    }

//    public static void main(String[] args) {
//     ARRAY sol = new ARRAY();
//     int[] nums = {0,1,0,3,12};
//     sol.moveZeroes(nums);
//     System.out.println(Arrays.toString(nums));
//    }


// public int removeDuplicates(int[] nums) {
//     if (nums.length == 0) return 0;

//     int i = 0;
//     for (int j = 1; j <nums.length; j++){
//         if(nums[j] != nums[i]){
//             i++;
//             nums[i] = nums[j];
//         }
//     }
//     return i + 1;
// }

// public static void main(String[] args) {
//     ARRAY sol = new ARRAY();
//     int[] nums = {0,0,1,1,1,2,2,3,3,4};
//     int k = sol.removeDuplicates(nums);
//     System.out.println("Unique counter:" + k);
//     System.out.println("Array after removal:" + Arrays.toString(nums));
// }

public int[] productExceptSelf(int[] nums){
    int n = nums.length;
    int[] Output = new int[n];

    Output[0] = 1;
    for (int i = 1; i < n; i++){
        Output[i] = Output[i - 1] * nums[i - 1];
    }
    int rightProduct = 1;
    for (int i = 1; i < n; i++){
        Output[i] = Output[i] * rightProduct;
        rightProduct *= nums[i];
    }

    return Output;
}

public static void main(String[] args) {
    ARRAY sol = new ARRAY();
    int[] nums = {1,2,3,4};
    System.out.println(Arrays.toString(sol.productExceptSelf(nums)));
}
}



