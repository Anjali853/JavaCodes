import java.util.*;

public class dsa8 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), new boolean[nums.length], result);
        return result;
    }

    private void backtrack(int[] nums, List<Integer> current, boolean[] used, List<List<Integer>> result) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue; // already taken
            current.add(nums[i]);
            used[i] = true;
            backtrack(nums, current, used, result);
            current.remove(current.size() - 1); // backtrack
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        dsa8 obj = new dsa8();
        int[] nums = {1, 2, 3};
        List<List<Integer>> output = obj.permute(nums);
        System.out.println(output);
    }
}
