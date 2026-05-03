package kuchbhi;
import java.util.HashSet;
import java.util.Scanner;

public class NRepeated {
    public static int repeatedNTimes(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return num;   
            }
            set.add(num);
        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        int result = repeatedNTimes(nums);
        System.out.println("Element repeated n times: " + result);

        sc.close();
    }
}
