class Solution {
    public boolean isSubsequence(String s, String t) {
        int count = 0;
        int count1 = 0;
        char ss[] = s.toCharArray();
        char tt[] = t.toCharArray();
        if(s.length() < 1)
        {
            return true;
        }
        while(count < t.length())
        {
            if(tt[count] == ss[count1])
            {
                count1++;
            }
            count++;
            if(count1 == s.length())
        {
            return true;
        }
        }
        
        return false;
    }
}