class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            int backward = i;
            int forward = i;

            int jumpB = 0;
            int jumpF = 0;

            while (backward >= 0 && s.charAt(backward) != c) {
                backward--;
                jumpB++;
            }
            if (backward < 0) jumpB = Integer.MAX_VALUE;

            while (forward < n && s.charAt(forward) != c) {
                forward++;
                jumpF++;
            }
            if (forward >= n) jumpF = Integer.MAX_VALUE;

            arr[i] = Math.min(jumpB, jumpF);
        }

        return arr;
    }
}
