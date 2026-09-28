class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        String vowels="aeiouAEIOU";
        StringBuilder sb=new StringBuilder(s);
      
    while (i < j) {

            if (vowels.indexOf(sb.charAt(i)) == -1) {
                i++;
            }
            else if (vowels.indexOf(sb.charAt(j)) == -1) {
                j--;
            }
            else {
                
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);

                i++;
                j--;
            }
        }
       return sb.toString();
    }
}