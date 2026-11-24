class findKthSmallest {
    public long findKthSmallest(int[] coins, int k) {
        long low = 1;
        long high = (long) coins[0] * k;

        for (int coin : coins) {
            high = Math.min(high, (long) coin * k);
        }

        while (low < high) {
            long mid = low + (high - low) / 2;

            if (count(mid, coins) >= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private long count(long x, int[] coins) {
        int n = coins.length;
        long result = 0;

        for (int mask = 1; mask < (1 << n); mask++) {
            long lcm = 1;
            boolean valid = true;
            int bits = 0;

            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    bits++;

                    lcm = getLCM(lcm, coins[i]);

                    if (lcm > x) {
                        valid = false;
                        break;
                    }
                }
            }

            if (!valid)
                continue;

            long cnt = x / lcm;

            if (bits % 2 == 1) {
                result += cnt;
            } else {
                result -= cnt;
            }
        }

        return result;
    }

    private long getLCM(long a, long b) {
        return a / gcd(a, b) * b;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        findKthSmallest solution = new findKthSmallest();
        int[] coins = { 2, 3, 5 };
        int k = 5;
        long result = solution.findKthSmallest(coins, k);
        System.out.println("The " + k + "th smallest number that can be formed is: " + result);
    }
}