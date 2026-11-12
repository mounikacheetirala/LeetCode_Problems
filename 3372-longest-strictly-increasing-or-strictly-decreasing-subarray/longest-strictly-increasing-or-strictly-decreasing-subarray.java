class Solution {
    public int longestMonotonicSubarray(int[] nums) {
    
        int il = 1;
        int dl = 1;
        int ml = 1;
        for(int i = 0;i < nums.length-1;i++)
        {
            if(nums[i + 1] > nums[i])
            {
                il++;
                dl = 1;
            }
            else if(nums[i + 1] < nums[i])
            {
                dl++;
                il = 1;
            }
            else
            {
                il = 1;
                dl = 1;
            }
            ml = Math.max(ml,Math.max(il,dl));
        }
        return ml;
    }
}