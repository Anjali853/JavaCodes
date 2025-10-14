    import java.util.*;
    public class Arrayprb {
    
        public int majorityElement(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
    
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
                if (map.get(num) > nums.length / 2) {
                    return num;
                }
            }
    
            return -1; 
        }
    
        public static void main(String[] args) {
            Solution sol = new Solution();
            int[] nums = {2,2,1,1,1,2,2};
            System.out.println(sol.majorityElement(nums)); // 2
        }
    }
    


    

