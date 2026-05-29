class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {
            // if current index is unreachable
            if (i > maxReach) {
                return false;
            }

            // update the farthest we can reach
            maxReach = Math.max(maxReach, i + nums[i]);
        }

        return true;
    }
}
