class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         HashMap <Integer, Integer> list = new HashMap<>();

         for (int val : nums) {
            if (list.containsKey(val)) {
                list.put(val, list.get(val) + 1);
            }

            else {
                list.put(val, 1);
            }
         }

         List<Integer>[] bucket = new LinkedList[nums.length + 1];

         for (Map.Entry<Integer, Integer> index : list.entrySet()) {

            int key = index.getKey();
            int value = index.getValue();

            if (bucket[value] == null) {
                List<Integer> newList = new LinkedList<>();
                bucket[value] = newList;

            }

            bucket[value].add(key);
         }

        int[] output = new int[k];
        int count = 0;

         for (int i = nums.length; i >= 0; i--) {
            if (bucket[i] == null) {
                continue;
            }

            for (int n : bucket[i]) {
                output[count] = n;
                count++;
                if (count == k) {
                    return output;
                }
            }
         }
         return output;
    }
}
