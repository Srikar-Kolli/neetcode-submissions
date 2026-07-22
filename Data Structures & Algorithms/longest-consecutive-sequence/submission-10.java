class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> sequence = new HashSet<>();

        for (int num: nums) {
            sequence.add(num);
        }

        int count = 1;
        int val = 0;
        int maxLength = 0;
        for (int num: nums) {
            if (sequence.contains(num - 1)) {
                continue;
            }
            val = num;
            
            while (sequence.contains(val + 1)) {
                val++;
                count++;
            }
            if (count > maxLength) {
                maxLength = count;
            }
            count = 1;
        }
        return maxLength;
    }
}
