class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        List <List<String>> output = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            String word = strs[i];
            int[] keyPlace = new int[26];
        
        for (int j = 0; j < word.length(); j++) {
            int letter = word.charAt(j) - 'a';
            keyPlace[letter]++;
        }

       String phrase = "";

       for (int val : keyPlace) {
        phrase += val + "#";
       }
        
        if (map.containsKey(phrase)) {
            map.get(phrase).add(strs[i]);
        }

        else {
            map.put(phrase, new ArrayList<String>());
            map.get(phrase).add(strs[i]);
        }
        }

        for (ArrayList<String> list : map.values()) {
            output.add(list);
        }

        return output;
    }
}




