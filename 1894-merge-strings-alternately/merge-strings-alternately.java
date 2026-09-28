class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int w1=word1.length();
        int w2=word2.length();
        int min=w1<w2?w1:w2;
        int max=w1>w2?w1:w2;
        String s="";
        if(w1>w2)
        {
            s=word1.substring(w2,w1);
        }
        else
        {
            s=word2.substring(w1,w2);
        }
        for(int i=0;i<min;i++)
        {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        return sb.append(s).toString();
    }
}