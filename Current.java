import java.util.Scanner;

//leetcode 1365
public class Current {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = { 8, 1, 2, 2, 3 };
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] < nums[i]) {
                    count++;
                }
            }
            ans[i] = count;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}