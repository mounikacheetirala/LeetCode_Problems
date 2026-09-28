class Solution {
    public int[] productExceptSelf(int[] nums) {
    
     int ans[] = new int[nums.length];
     int left = 1;
     for(int i=0;i<nums.length;i++)
     {
        ans[i] = left;
        left = left * nums[i];
     }
     int right = 1;
     for(int j=nums.length-1; j>=0; j--)
     {
        ans[j] = ans[j] * right;
        right = right * nums[j];
     }
     return ans;
    }
}
/*1,2,3,4
ans[0] = 1; left = 1 * 1 = 1
ans[1] = 1; left = 1 * 2 = 2
ans[2] = 2; left = 2 * 3 = 6
ans[3] = 6; left = 6 * 4 =24


ans[3] = 6;  right = 1 * 4 = 4 ans[-,-,-,6]
ans[2] = 8;  right = 4 * 2 = 12 ans[-,-,8,6]
ans[1] = 1;  right = 12 * 1 = 24 ans[-,12,8,6]
i=0 → ans[0]=1*24 = 24

 */