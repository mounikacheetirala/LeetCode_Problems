class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
     List<Boolean> candiesL = new ArrayList<>();
    //  for(int i = 0;i < candies.length;i++)
    //  {
    //     int n = candies[i]+extraCandies;
    //     boolean val = false;
    //     for(int j = 0;j < candies.length;j++)
    //     {
    //         if(n >= candies[j])
    //         {
    //             val = true;
    //         }
    //         else
    //         {
    //             val = false;
    //             break;
    //         }
    //     }
    //     candiesL.add(val);
    //  }   


      int max = candies[0];

        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        
  
        for (int i = 0; i < candies.length; i++) {
            candiesL.add(candies[i] + extraCandies >= max);
        }
     return candiesL;
    }
}