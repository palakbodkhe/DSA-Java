class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;

        int lo = 0, hi = n - 1;
        int firstNonNegative = n;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] >= 0) {
                firstNonNegative = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        int neg = firstNonNegative;

        lo = 0;
        hi = n - 1;
        int firstPositive = n;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] > 0) {
                firstPositive = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        int pos = n - firstPositive;

        return Math.max(pos, neg);
    }
}
