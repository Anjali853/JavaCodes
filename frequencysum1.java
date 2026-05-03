import java.util.*;
import java.util.HashMap;
 class frequencysum {
    
    public int maxFrequencyElements(int[] nums) {
       HashMap<Integer, Integer> cnt = new HashMap<>();
        for (int x : nums) cnt.put(x, cnt.getOrDefault(x, 0) + 1);

        int maxFreq = 0;
        for (int f : cnt.values()) if (f > maxFreq) maxFreq = f;

        int total = 0;
        for (int f : cnt.values()) if (f == maxFreq) total += f;

        return total;
    }
    

}

public class frequencysum1 {
    public static void main(String[] args) {
        frequencysum fs = new frequencysum();
        int[] nums = {1, 2, 2, 3, 3, 3};
        System.out.println(fs.maxFrequencyElements(nums));
    }
}

    
