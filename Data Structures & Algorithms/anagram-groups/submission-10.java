class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap <String, ArrayList<String>> map = new HashMap<>();

        List <List<String>> group = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            char[] str = strs[i].toCharArray();

            Arrays.sort(str);

            String s = new String(str);


            if (map.containsKey(s)) {
                map.get(s).add(strs[i]);
            }

            else {
                map.put(s, new ArrayList <String>());
                map.get(s).add(strs[i]);
            }
        }

        for (ArrayList<String> list : map.values()) {
            group.add(list);
        }

        return group;
        
    }
}
