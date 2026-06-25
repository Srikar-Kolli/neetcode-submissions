class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashSet <Integer> newList = new HashSet<>();

        for (int val: nums) {
            if (newList.contains(val)) {
                return true;
            }

            else 
            newList.add(val);
            
        }

        return false;
    }
}