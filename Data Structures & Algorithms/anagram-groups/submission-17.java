class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap <String, ArrayList<String>> map = new HashMap<>();

        List <List<String>> group = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            String word = strs[i];

            int[] count = new int[26];

            for (int j = 0; j < word.length(); j++) {
                char letter = word.charAt(j);

                int index = letter - 'a';

                count[index]++;

            }

        String phrase = "";

        for (int val : count) {
            phrase += val + "" + "#";
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
            group.add(list);
        }

        return group;
        
    }
}
