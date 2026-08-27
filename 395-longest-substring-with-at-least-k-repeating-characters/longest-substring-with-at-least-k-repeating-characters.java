class Solution {
    public int longestSubstring(String s, int k) {

        if (s.length() < k) {
            return 0;
        }

        int[] freq = new int[26];

        // Count frequency
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Find a character whose frequency is less than k
        for (int i = 0; i < s.length(); i++) {

            if (freq[s.charAt(i) - 'a'] < k) {

                String left = s.substring(0, i);
                String right = s.substring(i + 1);

                return Math.max(
                    longestSubstring(left, k),
                    longestSubstring(right, k)
                );
            }
        }

        // Every character appears at least k times
        return s.length();
    }
}