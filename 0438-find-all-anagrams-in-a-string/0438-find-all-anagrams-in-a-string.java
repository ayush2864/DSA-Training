class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if (p.length() > s.length())
            return ans;

        int[] pCount = new int[26];
        int[] window = new int[26];

        // Count characters
        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
            window[s.charAt(i) - 'a']++;
        }

        // Check first window
        if (Arrays.equals(pCount, window))
            ans.add(0);

        // Slide window
        for (int i = p.length(); i < s.length(); i++) {

            window[s.charAt(i) - 'a']++;                 // Add new character
            window[s.charAt(i - p.length()) - 'a']--;   // Remove old character

            if (Arrays.equals(pCount, window))
                ans.add(i - p.length() + 1);
        }

        return ans;
    }
}