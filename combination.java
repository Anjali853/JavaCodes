import java.util.ArrayList;
import java.util.List;
class combination {

    List<List<Integer>> ans = new ArrayList<>();

    public void solve(int[] candidates, int target,
                      List<Integer> temp, int index) {

        // Base Case
        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for (int i = index; i < candidates.length; i++) {

            if (candidates[i] > target)
                continue;

         
            temp.add(candidates[i]);

            
            solve(candidates, target - candidates[i], temp, i);

            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        solve(candidates, target, new ArrayList<>(), 0);

        return ans;
    }
}