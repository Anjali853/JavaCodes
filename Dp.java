 import java.util.*;
class Dp {
    public int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0; // Base case: 0 coins to make amount 0

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        Dp obj = new Dp();
        int[] coins = {1, 2, 5};
        int amount = 11;
        int result = obj.coinChange(coins, amount);
        System.out.println("Minimum coins required: " + result);
    }
}

    

