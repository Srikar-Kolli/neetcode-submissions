class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            String lower = s.toLowerCase();
            if (Character.isLetterOrDigit(lower.charAt(left))) {
                if (Character.isLetterOrDigit(lower.charAt(right))) {

                    if (lower.charAt(left) != lower.charAt(right)) {
                        return false;
                    }
                    left++;
                    right--;
                }
                
                else {
                    right--;
                }
            }
            else {
                left++;
            }
        }

        return true;
                
                
        
    }
}
