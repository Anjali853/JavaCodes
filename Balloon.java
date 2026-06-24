import java.util.Arrays;
import java.util.Scanner;

public class Balloon {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
         int m = scanner.nextInt();
         int[] balloons = new int[n];
            for (int i = 0; i < n; i++) {
                balloons[i] = scanner.nextInt();
            }
            int[] arrows = new int[m];
            for (int i = 0; i < m; i++) {
                arrows[i] = scanner.nextInt();
            }

            Arrays.sort(balloons);
            Arrays.sort(arrows);
            int count = 0;
            int j = 0;
            for (int i = 0; i < n && j < m; i++) {
                if (balloons[i] <= arrows[j]) {
                    count++;
                    j++;
                }
            }
            System.out.println(count);
    }
    
}
