class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] leftArray = new int[nums.length];
        int[] rightArray = new int[nums.length];

        int[] output = new int[nums.length];

        int leftProduct = 1;
        for (int i = 0; i < nums.length; i++) {

            leftArray[i] = leftProduct;

            leftProduct *= nums[i];
        }

        int rightProduct = 1;
        for (int i = nums.length-1; i >= 0; i--) {
            rightArray[i] = rightProduct;
            rightProduct *= nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            output[i] = leftArray[i] * rightArray[i];
        }

        return output;

    }
}  
