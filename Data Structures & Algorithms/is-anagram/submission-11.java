class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap <Character, Integer> valTrack = new HashMap<>();
        HashMap <Character, Integer> valCompare = new HashMap<>();
        

        for (int i = 0; i < s.length(); i++) {
            char val = s.charAt(i);

            if (valTrack.containsKey(val)) {
                valTrack.put(val, valTrack.get(val) + 1);
            }

            else {
                valTrack.put(val, 1);
            }

        }

        for (int j = 0; j < t.length(); j++) {
            char newVal = t.charAt(j);

            if (valCompare.containsKey(newVal)) {
                valCompare.put(newVal, valCompare.get(newVal) + 1);
            }
            else {
                valCompare.put(newVal, 1);
            }

        }

        if (valTrack.equals(valCompare)) {
            return true;
        }

        return false;
    }
}
