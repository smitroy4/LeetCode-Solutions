public class Solution {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        long left = -10_000_000_000L, right = 10_000_000_000L;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (count(nums1, nums2, mid) < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    private long count(int[] nums1, int[] nums2, long prod) {
        long cnt = 0;
        int n2 = nums2.length;
        for (int a : nums1) {
            if (a > 0) {
                long bound = Math.floorDiv(prod, a);
                cnt += upperBound(nums2, bound);
            } else if (a < 0) {
                double div = (double) prod / a;
                long threshold = (long) Math.ceil(div);
                cnt += n2 - lowerBound(nums2, threshold);
            } else {
                if (prod >= 0) {
                    cnt += n2;
                }
            }
        }
        return cnt;
    }

    private int lowerBound(int[] arr, long target) {
        int l = 0, r = arr.length;
        while (l < r) {
            int m = (l + r) / 2;
            if (arr[m] < target) l = m + 1;
            else r = m;
        }
        return l;
    }

    private int upperBound(int[] arr, long target) {
        int l = 0, r = arr.length;
        while (l < r) {
            int m = (l + r) / 2;
            if (arr[m] <= target) l = m + 1;
            else r = m;
        }
        return l;
    }
}