class Solution {
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public int maxVowels(String s, int k) {
        int cur = 0;

        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                cur++;
            }
        }

        int ans = cur;

        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                cur++;
            }
            if (isVowel(s.charAt(i - k))) {
                cur--;
            }

            if (cur > ans) {
                ans = cur;
            }

            if (ans == k) {
                return k;
            }
        }

        return ans;
    }
}