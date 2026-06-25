class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap <Character, Integer> valTrack = new HashMap<>();
        

        for (char val: s.toCharArray()) {

            if (valTrack.containsKey(val)) {
                valTrack.put(val, valTrack.get(val) + 1);
            }

            else {
                valTrack.put(val, 1);
            }

        }

        for (char newVal: t.toCharArray()) {
            if (valTrack.containsKey(newVal)) {
                valTrack.put(newVal, valTrack.get(newVal) - 1);
            }
            else {
                return false;
            }

        }

        for (int count: valTrack.values()) {
            if (count != 0) {
            return false;
            }
        }
        return true;
    }
}
