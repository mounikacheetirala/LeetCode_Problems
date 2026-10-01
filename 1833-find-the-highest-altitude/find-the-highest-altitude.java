class Solution {
    public int largestAltitude(int[] gain) {
        int cur = 0;

        int max = cur;

        for(int g : gain)
        {
            cur += g;
            max = Math.max(max,cur);
        }
        return max;
    }
}