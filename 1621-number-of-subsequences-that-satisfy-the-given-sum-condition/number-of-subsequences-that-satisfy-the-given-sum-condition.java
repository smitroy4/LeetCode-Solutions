public class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int MOD = 1000000007;
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] * 2 > target) break;

            int l = i, r = nums.length - 1;
            while (l <= r) {
                int mid = l + (r - l) / 2;
                if (nums[i] + nums[mid] <= target) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }

            long count = pow(2, r - i, MOD);
            res = (int) ((res + count) % MOD);
        }
        return res;
    }

    private long pow(int base, int exp, int mod) {
        long result = 1;
        long b = base;
        while (exp > 0) {
            if ((exp & 1) == 1) result = (result * b) % mod;
            b = (b * b) % mod;
            exp >>= 1;
        }
        return result;
    }
}