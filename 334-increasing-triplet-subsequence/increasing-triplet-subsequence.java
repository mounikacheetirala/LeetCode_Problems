class Solution {
    public boolean increasingTriplet(int[] nums) {
    //     int i=0;
    //     int j=1;
    //     int k=2;
    //     int n=nums.length/3;
    //    int min1=0,min2=0,min3=0;
    //   int i1=0,j1=0,k1=0;
    //    while(n != 0)
    //    {
    //     min1 = nums[i];
    //     min2 = nums[j];
    //     min3 = nums[k];
    //     i+=3;
    //     j+=3;
    //     k+=3;
    //     if(i<nums.length)
    //     {
    //         if(min1 > nums[i])
    //         {
    //              min1 = nums[i];
    //         i1=i;
    //         }
           
    //     }
       
    //     if( j<nums.length)
    //     {
    //         if(min2 > nums[j])
    //         {
    //              min2 = nums[j];
    //         j1=j;
    //         }
           
    //     }

    //     if(k<nums.length)
    //     {
    //         if(min3 > nums[k])
    //         {
    //              min3 = nums[k];
    //              k1=k;
    //         }
           
    //     }
    //     n--;
    //    }
    //    if(((i < j) && (j < k)) && ((min1 < min2) && (min2 < min3)))
    //    {
    //     return true;
    //    }
    //    return false;
    int first = Integer.MAX_VALUE;
    int sec = Integer.MAX_VALUE;
     for(int n : nums)
     {
        if(first >= n)
        {
            first = n;
        }
        else if(sec >= n)
        {
            sec = n;
        }
        else
        {
            return true;
        }
     }
     return false;
    }
}