import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.SourceDataLine;

public class Separate {
     public int[] separateDigits(int[] nums) {

        List<Integer> list = new ArrayList<>();

        for (int num : nums) {

            String s = String.valueOf(num);

            for (char ch : s.toCharArray()) {
                list.add(ch - '0');
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
     }
     public static void main(String[] args) {
         System.out.println(java.util.Arrays.toString(new Separate().separateDigits(new int[]{13, 25, 83, 77})));
     }
}
