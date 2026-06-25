class Solution {
    public int[] twoSum(int[] nums, int target) {


        HashMap <Integer, Integer> newSearch = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int val = target - nums[i];

            if (newSearch.containsKey(val)) {
                return new int[] {newSearch.get(val), i};

            }

            newSearch.put(nums[i], i);

            
        }

        return new int[0];
        
    }
}
