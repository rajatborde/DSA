import java.util.HashMap;

class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int w = 0;
        int maxFreq = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int r = 0; r < s.length(); r++) {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(s.charAt(r)));

            if ((r - l + 1) - maxFreq > k) {
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l++;
            }

            w = Math.max(w, r - l + 1);
        }
        return w;
    }
}