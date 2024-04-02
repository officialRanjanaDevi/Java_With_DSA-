class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // Check if sChar is mapped to different tChar
            if (sMap.containsKey(sChar) && sMap.get(sChar) != tChar) {
                return false;
            }
            // Check if tChar is mapped to different sChar
            if (tMap.containsKey(tChar) && tMap.get(tChar) != sChar) {
                return false;
            }

            // Update mapping
            sMap.put(sChar, tChar);
            tMap.put(tChar, sChar);
        }

        return true;
    }
}